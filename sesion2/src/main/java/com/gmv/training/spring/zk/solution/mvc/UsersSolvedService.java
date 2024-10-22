package com.gmv.training.spring.zk.solution.mvc;

import java.util.List;

public interface UsersSolvedService {

	
	/**
	 * Create a user
	 * @param username username to create
	 * @param email email of user
	 */
	void createUser(String username, String email, String password);
	
	/**
	 * Get all users
	 * @return {@link List<User>}
	 */
	List<UserSolved> getUsers();
	
	/**
	 * Get user by username
	 * @param username username to find
	 * @return {@link UserSolved}
	 */
	UserSolved getUser(String username);
	
	/**
	 * Remove a user
	 * @param username username to delete
	 */
	void removeUser(String username);
	
}
