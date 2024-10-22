package com.gmv.training.spring.ae.di.exercise.scopes.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TasksSingleton {

	private String name = "Task 1";
	
	public String getTask() {
		return name;
	}
	
	public void setTask(String name) {
		this.name = name;
	}
	
}
