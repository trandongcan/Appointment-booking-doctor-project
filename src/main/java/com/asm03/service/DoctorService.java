package com.asm03.service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import javax.print.Doc;

import org.springframework.stereotype.Service;

import com.asm03.entity.Appointment;
import com.asm03.entity.CurrentSession;
import com.asm03.entity.Doctor;
import com.asm03.entity.Patient;
import com.asm03.entity.Review;
import com.asm03.exception.AppointmentException;
import com.asm03.exception.DoctorException;
import com.asm03.exception.LoginException;
import com.asm03.exception.PatientException;
import com.asm03.exception.ReviewException;
import com.asm03.exception.TimeDateException;


public interface DoctorService {
	
	List<Doctor> getAllDoctorsRegisterFromDatabase() throws DoctorException;
	
	Doctor getDoctorByUuid(String uuid) throws PatientException;
	
	CurrentSession getCurrentUserByUuid(String uuid) throws LoginException;
	
	List<LocalDateTime> getDoctorAvailableTimingForBooking(String key, Doctor doctor) throws IOException, TimeDateException, DoctorException;
	
	List<Appointment> getUpcommingDoctorAppointment(Doctor doctor) throws AppointmentException;
	
	List<Appointment> getPastDoctorAppointment(Doctor doctor) throws AppointmentException;
	
	List<Appointment> getAllAppointments(Doctor registerDoctor) throws DoctorException;
	
	Doctor getDoctorDetails(String key) throws PatientException;

	Review getReviewOfParticularAppointment(String key, Appointment appointment) throws PatientException, ReviewException;

	List<Patient> getListOfPatient();
	
}
