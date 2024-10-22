package com.gmv.training.spring.zk.solution.mvc;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthSolvedServiceImpl implements AuthSolvedService {
	
	@Autowired
	UsersSolvedService usersService;

	@Override
	public boolean login(String username, String password) {
		UserSolved user = usersService.getUser(username);
		return user.getPassword() != null && password.equals(user.getPassword()); 
	}

	
	

}
