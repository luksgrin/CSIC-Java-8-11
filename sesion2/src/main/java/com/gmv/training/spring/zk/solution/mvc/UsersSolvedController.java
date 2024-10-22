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

import com.gmv.training.configuration.UsersServiceFactory;
import com.gmv.training.spring.ak.exercise.mvc.UsersService;

@Controller
@RequestMapping("/spring-mvc-solved")
public class UsersSolvedController {
	
	@Autowired
	private UsersSolvedService service;
	
	
	@GetMapping()
	public String users(Locale locale, Model model) {
		List<UserSolved> users = service.getUsers();
		model.addAttribute("users", users);
		return "users-solved";
	}
	
	@RequestMapping(value="/new-user", method = RequestMethod.GET)
	public String get(Locale locale, Model model) {
		return "new-user-solved";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String create(UserSolved user, Model model) {
		service.createUser(user.getUserName(), user.getEmail(), user.getPassword());
		model.addAttribute("createdSuccesfully", true);
		return "new-user-solved";
	}
	
	@RequestMapping(value="/remove-user", method = RequestMethod.POST)
	public String delete(@RequestParam String username, Model model) {
		service.removeUser(username);
		model.addAttribute("user", username);
		return "remove-user-solved";
	}
}
