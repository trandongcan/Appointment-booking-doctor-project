package com.asm03.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class LoginResponse {

	private Boolean loginOrNot;

	public LoginResponse(Boolean loginOrNot) {
		this.loginOrNot = loginOrNot;
	}
}
