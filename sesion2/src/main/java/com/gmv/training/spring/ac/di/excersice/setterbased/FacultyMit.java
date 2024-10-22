package com.gmv.training.spring.ac.di.excersice.setterbased;

import org.springframework.stereotype.Component;

@Component
public class FacultyMit {

	private String name = "MIT";
	
	public String getFaculty() {
		return name;
	}
	
}
