package com.asm03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm03.entity.Appointment;

public interface AppointmentDao extends JpaRepository<Appointment, Integer> {

}
