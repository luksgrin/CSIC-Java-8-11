package com.gmv.training.spring.af.di.exercise.scopes.prototype;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TasksPrototype {

	private String name = "Task 1";
	
	public String getTask() {
		return name;
	}
	
	public void setTask(String name) {
		this.name = name;
	}
	
}
