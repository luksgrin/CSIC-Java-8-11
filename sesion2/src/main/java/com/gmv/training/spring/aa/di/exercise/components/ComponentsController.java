package com.gmv.training.spring.aa.di.exercise.components;


import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring-components")
public class ComponentsController {
	

	private FacultyHarvard faculty;
	
	public ComponentsController(FacultyHarvard faculty) {
		this.faculty = faculty;
	}
	
	@GetMapping()
	public @ResponseBody String getFaculty(Locale locale, Model model) {
		return faculty.getFaculty();
	}

}
