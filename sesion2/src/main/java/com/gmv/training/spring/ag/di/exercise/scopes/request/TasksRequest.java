package com.gmv.training.spring.ag.di.exercise.scopes.request;

import org.springframework.stereotype.Component;

@Component
public class TasksRequest {

	private String name = "Task 1";
	
	public String getTask() {
		return name;
	}
	
	public void setTask(String name) {
		this.name = name;
	}
	
}
