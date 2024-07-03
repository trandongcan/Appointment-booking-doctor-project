package com.asm03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm03.entity.Patient;



public interface PatientDao extends JpaRepository<Patient, Integer> {
	
	public Patient findByMobileNo(String mobileNo);
}
