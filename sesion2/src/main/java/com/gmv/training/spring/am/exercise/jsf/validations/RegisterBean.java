package com.gmv.training.spring.am.exercise.jsf.validations;


import javax.annotation.ManagedBean;

import org.springframework.stereotype.Component;


@Component
@ManagedBean
public class RegisterBean {

	
    private String username;
    private String password;
    private String email;
    private boolean isRegisterOk = false;
    
	
	public void register() {
		username = null;
		email = null;
		password = null;
		isRegisterOk = true;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getIsRegisterOk() {
		return isRegisterOk;
	}

	public void setIsRegisterOk(boolean isRegisterOk) {
		this.isRegisterOk = isRegisterOk;
	}
}
