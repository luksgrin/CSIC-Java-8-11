package com.gmv.training.spring.zk.solution.mvc;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/spring-mvc-solved/login")
public class LoginSolvedController {
	
	@Autowired
	private AuthSolvedService authService;
	
	@GetMapping()
	public String users(Locale locale, Model model) {
		return "login-solved";
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String create(@Validated UserSolved user, Model model) {
		model.addAttribute("createdSuccesfully", authService.login(user.getUserName(), user.getPassword()));
		return "login-solved";
	}
	
}
