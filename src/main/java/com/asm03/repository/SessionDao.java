package com.asm03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm03.entity.CurrentSession;


public interface SessionDao extends JpaRepository<CurrentSession, Integer> {
	
	public CurrentSession findByUuid(String uuid);
	
}
