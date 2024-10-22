package com.gmv.training.spring.ah.di.exercise.configuration;


import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String pistons="1";
	
	private String cilinders="125";

	public String getPistons() {
		return pistons;
	}

	public void setPistons(String pistons) {
		this.pistons = pistons;
	}

	public String getCilinders() {
		return cilinders;
	}

	public void setCilinders(String cilinders) {
		this.cilinders = cilinders;
	}

	
}
