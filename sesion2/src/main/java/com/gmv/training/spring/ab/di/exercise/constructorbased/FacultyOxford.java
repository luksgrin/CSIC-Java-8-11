package com.gmv.training.spring.ab.di.exercise.constructorbased;

import org.springframework.stereotype.Component;

@Component
public class FacultyOxford {

	private String name = "Oxford";
	
	public String getFaculty() {
		return name;
	}
	
}
