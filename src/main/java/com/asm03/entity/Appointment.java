package com.asm03.entity;


import java.beans.JavaBean;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
@ToString
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appointmentId;
	
	@ManyToOne
	private Patient patient;
	
	
	// Appointement default time will be 60 mins from appoaintment start time.
	

	private LocalDateTime appointmentDateAndTime;
	
	
	@ManyToOne
	private Doctor doctor;
	
	@OneToOne
	@JsonIgnore
	private Review review;


	@Override
	public int hashCode() {
		return Objects.hash(appointmentId);
	}


	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		Appointment other = (Appointment) obj;
		
		return Objects.equals(appointmentId, other.appointmentId);

	}


	public Integer getAppointmentId() {
		return appointmentId;
	}


	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public LocalDateTime getAppointmentDateAndTime() {
		return appointmentDateAndTime;
	}


	public void setAppointmentDateAndTime(LocalDateTime appointmentDateAndTime) {
		this.appointmentDateAndTime = appointmentDateAndTime;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Review getReview() {
		return review;
	}


	public void setReview(Review review) {
		this.review = review;
	}


	
	
	

}

