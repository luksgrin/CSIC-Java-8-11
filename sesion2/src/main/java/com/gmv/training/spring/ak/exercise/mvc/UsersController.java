package com.gmv.training.spring.ak.exercise.mvc;

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

@Controller
@RequestMapping("/spring-mvc")
public class UsersController {
	
	private UsersService service;
	
	public UsersController(UsersServiceFactory factory) {
		service = factory.getService();
	}
	
	@GetMapping()
	public String users(Locale locale, Model model) {
		List<User> users = service.getUsers();
		model.addAttribute("users", users);
		return "users";
	}
	
	@RequestMapping(value="/new-user", method = RequestMethod.GET)
	public String get(Locale locale, Model model) {
		return "new-user";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String create(User user, Model model) {
		service.createUser(user.getUserName(), user.getEmail(), user.getPassword());
		model.addAttribute("createdSuccesfully", true);
		return "new-user";
	}
	
	@RequestMapping(value="/remove-user", method = RequestMethod.POST)
	public String delete(@RequestParam String username, Model model) {
		service.removeUser(username);
		model.addAttribute("user", username);
		return "remove-user";
	}
}
