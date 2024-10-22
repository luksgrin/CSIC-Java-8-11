package com.gmv.training.spring.af.di.exercise.scopes.prototype;


import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring-prototype")
public class ScopesPrototypeController {
	
	@Autowired
	private TasksPrototype tasksPrototype;
	
	@GetMapping()
	public @ResponseBody String get(Locale locale, Model model) {
		return tasksPrototype.getTask();
	}
	
	@GetMapping("/change-task")
	public @ResponseBody String setTask(Locale locale, Model model) {
		Integer taskNumber = getTaskNumber();
		tasksPrototype.setTask("Tarea " + taskNumber);
		return "Cambiada a tarea " + taskNumber;
	}
	
	private Integer getTaskNumber() {
		Random rand = new Random(); 
		return rand.nextInt();
	}

}
