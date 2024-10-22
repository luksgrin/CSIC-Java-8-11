package com.gmv.training.spring.ab.di.exercise.constructorbased;


import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring-constructor-based")
public class ConstructorBasedController {
		
	// add dependency injection here
	
	@GetMapping()
	public @ResponseBody String getFaculty(Locale locale, Model model) {
		return "TO_IMPLEMENT";
	}

}
