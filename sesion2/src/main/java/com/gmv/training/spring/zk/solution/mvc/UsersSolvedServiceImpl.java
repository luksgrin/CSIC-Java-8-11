package com.gmv.training.spring.zk.solution.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class UsersSolvedServiceImpl implements UsersSolvedService {

	private List<UserSolved> users;
	
	/**
	 * initialize users
	 */
	@PostConstruct
	public void initializeUsers() {
		UserSolved userPablo = new UserSolved();
		userPablo.setUserName("pabloc");
		userPablo.setEmail("pabloc@gmv.com");
		userPablo.setPassword("pabloc");
		UserSolved userJuan = new UserSolved();
		userJuan.setUserName("juanl");
		userJuan.setEmail("juanl@gmv.com");
		userJuan.setPassword("juanl");
		UserSolved userPedro = new UserSolved();
		userPedro.setUserName("pedror");
		userPedro.setEmail("pedror@gmv.com");
		userPedro.setPassword("pedror");
		UserSolved userJose = new UserSolved();
		userJose.setUserName("josec");
		userJose.setEmail("josec@gmv.com");
		userJose.setPassword("josec");
		UserSolved admin = new UserSolved();
		admin.setUserName("admin");
		admin.setEmail("admin@gmv.com");
		admin.setPassword("admin");
		users = new ArrayList<UserSolved>();
		users.add(userJose);
		users.add(userJuan);
		users.add(userPedro);
		users.add(userPablo);
		users.add(admin);
	}

	/**
	 * (non-javadoc)
	 * 
	 * @see UsersSolvedService#createUser(String, String)
	 */
	@Override
	public void createUser(String username, String email, String password) {
		if(!existsUser(username)) {
			users.add(dtoToEntity(username, email, password));
		}
		
	}
	
	private boolean existsUser(String username) {
		boolean existsUser = false;
		for(UserSolved user: users) {
			if (user.getUserName().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	private UserSolved dtoToEntity(String username, String email, String password) {
		UserSolved user = new UserSolved();
		user.setUserName(username);
		user.setEmail(email);
		user.setPassword(password);
		return user;
	}

	/**
	 * (non-javadoc)
	 * 
	 * @see UsersSolvedService#getUsers()
	 */
	@Override
	public List<UserSolved> getUsers() {
		return users;
	}

	/**
	 * (non-javadoc)
	 * 
	 * @see UsersSolvedService#getUser(String username)
	 */
	@Override
	public UserSolved getUser(String username) {
		for(UserSolved user: users) {
			if (user.getUserName().equals(username)) {
				return user;
			}
		}
		return new UserSolved();
	}

	/**
	 * (non-javadoc)
	 * 
	 * @see UsersSolvedService#removeUser(String)
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
