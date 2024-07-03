package com.asm03.service;

import java.io.IOException;
import java.util.List;

import com.asm03.entity.Appointment;
import com.asm03.entity.CurrentSession;
import com.asm03.entity.Doctor;
import com.asm03.entity.ForgetPassword;
import com.asm03.entity.Patient;
import com.asm03.entity.Review;
import com.asm03.exception.AppointmentException;
import com.asm03.exception.DoctorException;
import com.asm03.exception.LoginException;
import com.asm03.exception.PasswordException;
import com.asm03.exception.PatientException;
import com.asm03.exception.ReviewException;
import com.asm03.exception.TimeDateException;

import jakarta.mail.MessagingException;


public interface PatientService {
	
	Patient createPatient(Patient customer) throws PatientException; 
	
	Patient updatePatient(Patient patient, String key) throws PatientException;
	
	Patient getPatientByUuid(String uuid) throws PatientException;
	
	CurrentSession getCurrentUserByUuid(String uuid) throws LoginException;
	
	Appointment bookAppointment(String key, Appointment appointment) throws AppointmentException, LoginException, DoctorException, IOException, TimeDateException, MessagingException;
	
	List<Appointment> getAllAppointmenPatientWise(String key)throws AppointmentException, PatientException;
	
	Appointment updateAppointment(String key, Appointment newAppointment) throws AppointmentException, PatientException, DoctorException, IOException, TimeDateException;
	
	List<Doctor> getAllDoctors() throws DoctorException;
	
	Appointment deleteAppointment(Appointment appointment) throws AppointmentException, DoctorException, Exception;

	Review makeReviewToDoctorAppointment(String key, Review review) throws AppointmentException, DoctorException, ReviewException;
	
	Review updateReview(String key, Review review) throws ReviewException;

	Float getDoctorRating(String key, Doctor doctor) throws DoctorException, ReviewException;

	Patient getPatientDetails(String key) throws PatientException;
	
	Review getReviewOfDoctorByPatient(String key,Review review) throws ReviewException, PatientException, DoctorException, AppointmentException;

	Patient forgetPassword(String key, ForgetPassword forgetPassword) throws PasswordException;

	Review deleteReview(String key, Review review) throws ReviewException; 
	
}
