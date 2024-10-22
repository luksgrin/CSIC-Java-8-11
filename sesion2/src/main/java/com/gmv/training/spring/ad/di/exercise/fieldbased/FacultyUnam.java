package com.gmv.training.spring.ad.di.exercise.fieldbased;

import org.springframework.stereotype.Component;

@Component
public class FacultyUnam {

	private String name = "UNAM";
	
	public String getFaculty() {
		return name;
	}
	
}
