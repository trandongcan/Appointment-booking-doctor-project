package com.asm03.service;

import java.util.List;

import com.asm03.entity.Doctor;
import com.asm03.entity.Message;
import com.asm03.entity.Patient;
import com.asm03.exception.DoctorException;
import com.asm03.exception.PatientException;

public interface MessageService {
	
	Message sendMessageFromPatientToDoctor(String key, Message message) throws PatientException, DoctorException;

	Message sendMessageFromDoctorToPatient(String key, Message message) throws PatientException, DoctorException;

	List<Message> getMessageOfPatientParticularDoctor(String key, Doctor doctor) throws DoctorException, PatientException;

	List<Message> getMessageOfDoctorParticularPatient(String key, Patient patient) throws DoctorException, PatientException;

}
