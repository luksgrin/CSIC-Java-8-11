package com.gmv.training.spring.an.exercise.jpa;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gmv.training.spring.ak.exercise.mvc.User;
import com.gmv.training.spring.ak.exercise.mvc.UsersService;

@Service
public class UsersJpaServiceImpl implements UsersService{

	@Override
	public void createUser(String username, String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUser(String username) {
		// TODO Auto-generated method stub
		
	}

}
