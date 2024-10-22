package com.gmv.training.spring.zk.solution.mvc;

import java.util.List;

public interface AuthSolvedService {

	
	/**
	 * login a user
	 * @param username username to login
	 * @param password password to login
	 */
	boolean login(String username, String password);
	
}
