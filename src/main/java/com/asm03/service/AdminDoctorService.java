package com.asm03.service;


import java.util.List;

import com.asm03.entity.Doctor;
import com.asm03.entity.Patient;
import com.asm03.exception.DoctorException;

public interface AdminDoctorService {
	
	
	Doctor registerDoctor(Doctor doctor) throws DoctorException;

	Doctor revokePermissionOfDoctor(Doctor doctor) throws DoctorException; 
	
	Doctor grantPermissionOfDoctor(Doctor doctor) throws DoctorException;
 
	List<Doctor> getAllValidInValidDoctors(String key) throws DoctorException;

}
