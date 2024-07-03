package com.asm03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm03.entity.Doctor;
import com.asm03.entity.Patient;

public interface DoctorDao extends JpaRepository<Doctor, Integer> {
	
	public Doctor findByMobileNo(String mobileNo);
}
