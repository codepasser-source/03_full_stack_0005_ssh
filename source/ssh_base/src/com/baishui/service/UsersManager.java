package com.baishui.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.baishui.dao.UsersDao;
import com.baishui.model.Users;

@Component("usersManager")
public class UsersManager {

	private UsersDao userDaoImpl;

	public UsersDao getUserDaoImpl() {
		return userDaoImpl;
	}

	@Resource(name="usersDaoImpl")
	public void setUserDaoImpl(UsersDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
	
	public void addUser(Users user){
		 System.out.println("usersManager"); 
		 this.userDaoImpl.addUser(user);  
	}
	
	
	public void deleteUser(Users user){
		 System.out.println("usersManager"); 
		 this.userDaoImpl.deleteUser(user);
	}
	
}
