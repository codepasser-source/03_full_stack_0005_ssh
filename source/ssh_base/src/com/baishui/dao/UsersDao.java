package com.baishui.dao;

import com.baishui.model.Users;

public interface UsersDao {

	public abstract String addUser(Users user);
	public abstract String deleteUser(Users user);
}
