package com.gmv.training.spring.ag.di.exercise.scopes.request;


import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring-request")
public class ScopesRequestController {
	
	@Autowired
	private TasksRequest tasksRequest;
	
	@GetMapping()
	public @ResponseBody String get(Locale locale, Model model) {
		return tasksRequest.getTask();
	}
	
	@GetMapping("/change-task")
	public @ResponseBody String setTask(Locale locale, Model model) {
		Integer taskNumber = getTaskNumber();
		tasksRequest.setTask("Tarea " + taskNumber);
		return "Cambiada tarea a " + taskNumber;
	}
	
	private Integer getTaskNumber() {
		Random rand = new Random(); 
		return rand.nextInt();
	}

}
