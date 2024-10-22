package com.gmv.training.spring.ak.exercise.mvc;

import java.util.List;

public interface UsersService {

	
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
	List<User> getUsers();
	
	/**
	 * Get user by username
	 * @param username username to find
	 * @return {@link User}
	 */
	User getUser(String username);
	
	/**
	 * Remove a user
	 * @param username username to delete
	 */
	void removeUser(String username);
	
}
