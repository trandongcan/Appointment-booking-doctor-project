package com.asm03.service;

import com.asm03.entity.LoginDTO;
import com.asm03.entity.LoginUUIDKey;
import com.asm03.exception.LoginException;

public interface PatientAndAdminLoginService {
	
	LoginUUIDKey logIntoAccount(LoginDTO loginDTO) throws LoginException;
	
	String logoutFromAccount(String key) throws LoginException;
	
	Boolean checkUserLoginOrNot(String key) throws LoginException;

}
