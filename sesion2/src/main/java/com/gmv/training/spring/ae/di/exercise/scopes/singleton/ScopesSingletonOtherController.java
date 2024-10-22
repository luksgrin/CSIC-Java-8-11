package com.gmv.training.spring.ae.di.exercise.scopes.singleton;


import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring-singleton-other")
public class ScopesSingletonOtherController {
	
	@Autowired
	private TasksSingleton tasksSingleton;
	
	@GetMapping()
	public @ResponseBody String get(Locale locale, Model model) {
		return tasksSingleton.getTask();
	}
	
	@GetMapping("/change-task")
	public @ResponseBody String setTask(Locale locale, Model model) {
		Integer taskNumber = getTaskNumber();
		tasksSingleton.setTask("Tarea " + taskNumber);
		return "Cambada a tarea " + taskNumber;
	}
	
	private Integer getTaskNumber() {
		Random rand = new Random(); 
		return rand.nextInt();
	}

}
