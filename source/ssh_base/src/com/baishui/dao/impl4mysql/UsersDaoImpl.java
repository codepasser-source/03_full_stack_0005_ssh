package com.baishui.dao.impl4mysql;

import org.springframework.stereotype.Component;

import com.baishui.dao.SuperDao;
import com.baishui.dao.UsersDao;
import com.baishui.model.Users;

@Component("usersDaoImpl")
public class UsersDaoImpl extends SuperDao implements UsersDao{
 
	
	public String addUser(Users user) {
		this.hibernateTemplate.save(user);
		return null;
	}

	public String deleteUser(Users user) {
		this.hibernateTemplate.delete(user);
		return null;
	}

}
