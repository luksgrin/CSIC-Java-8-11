package com.gmv.training.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gmv.training.spring.ak.exercise.mvc.UsersService;
import com.gmv.training.spring.ak.exercise.mvc.UsersServiceImpl;
import com.gmv.training.spring.an.exercise.jpa.UsersJpaServiceImpl;

@Component
public class UsersServiceFactory {

	private boolean isJpaExercise = false;
	
	@Autowired
	private UsersJpaServiceImpl jpaServiceImpl;
	
	@Autowired
	private UsersServiceImpl usersServiceImpl;
	
	public UsersService getService() {
		if (isJpaExercise) {
			return jpaServiceImpl;
		}
		return usersServiceImpl;
	}
}
