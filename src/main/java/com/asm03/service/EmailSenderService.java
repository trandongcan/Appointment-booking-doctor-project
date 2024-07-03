package com.asm03.service;

import com.asm03.entity.EmailBody;

import jakarta.mail.MessagingException;

public interface EmailSenderService {
	
	Boolean sendAppointmentBookingMail(String toEmail, EmailBody emailBody) throws MessagingException;
	

}
