package com.gmv.training.spring.ak.exercise.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

	private List<User> users;
	
	/**
	 * initialize users
	 */
	@PostConstruct
	public void UsersServiceImpl() {
		User userPablo = new User();
		userPablo.setUserName("pabloc");
		userPablo.setEmail("pabloc@gmv.com");
		userPablo.setPassword("pabloc");
		User userJuan = new User();
		userJuan.setUserName("juanl");
		userJuan.setEmail("juanl@gmv.com");
		userJuan.setPassword("juanl");
		User userPedro = new User();
		userPedro.setUserName("pedror");
		userPedro.setEmail("pedror@gmv.com");
		userPedro.setPassword("pedror");
		User userJose = new User();
		userJose.setUserName("josec");
		userJose.setEmail("josec@gmv.com");
		userJose.setPassword("josec");
		User admin = new User();
		admin.setUserName("admin");
		admin.setEmail("admin@gmv.com");
		admin.setPassword("admin");
		users = new ArrayList<User>();
		users.add(userJose);
		users.add(userJuan);
		users.add(userPedro);
		users.add(userPablo);
		users.add(admin);
	}

	/**
	 * (non-javadoc)
	 * 
	 * @see UsersService#createUser(String, String)
	 */
	@Override
	public void createUser(String username, String email, String password) {
		if(!existsUser(username)) {
			users.add(dtoToEntity(username, email, password));
		}
		
	}
	
	private boolean existsUser(String username) {
		boolean existsUser = false;
		for(User user: users) {
			if (user.getUserName().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	private User dtoToEntity(String username, String email, String password) {
		User user = new User();
		user.setUserName(username);
		user.setEmail(email);
		user.setPassword(password);
		return user;
	}

	/**
	 * (non-javadoc)
	 * 
	 * @see UsersService#getUsers()
	 */
	@Override
	public List<User> getUsers() {
		return users;
	}

	/**
	 * (non-javadoc)
	 * 
	 * @see UsersService#getUser(String username)
	 */
	@Override
	public User getUser(String username) {
		for(User user: users) {
			if (user.getUserName().equals(username)) {
				return user;
			}
		}
		return new User();
	}

	/**
	 * (non-javadoc)
	 * 
	 * @see UsersService#removeUser(String)
	 */
	@Override
	public void removeUser(String username) {
		for(int i = 0 ; i< users.size(); i++) {
			if (users.get(i).getUserName().equals(username)) {
				users.remove(i);
			}
		}
	}
	
	

}
