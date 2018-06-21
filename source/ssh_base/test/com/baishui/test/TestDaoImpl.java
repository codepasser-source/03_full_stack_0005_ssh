package com.baishui.test; 

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baishui.action.UsersAction;
import com.baishui.model.Role;
import com.baishui.model.Users;
  

public class TestDaoImpl {

	@Test
	public void testStartHibrenate(){
		
		ApplicationContext app = new  ClassPathXmlApplicationContext("beans.xml");
	    UsersAction usersAction1=(UsersAction) app.getBean("usersAction");
	    
	    Role role1 = new Role();
	    role1.setId("030");
	    
	    Users user1 = new Users();
	    user1.setRole(role1);
	    user1.setPassword("123456");
	    user1.setUsername("成阳阳");
	    usersAction1.setUser(user1);
	    usersAction1.addUser();
	    
         UsersAction usersAction2=(UsersAction) app.getBean("usersAction");
	    
	    Role role2 = new Role();
	    role2.setId("0200");
	    
	    Users user2 = new Users();
	    user2.setRole(role2);
	    user2.setPassword("123456");
	    user2.setUsername("白水");
	    usersAction2.setUser(user2);
	    usersAction2.addUser();
	    
	}
	
	@Test
	public void testUserAction(){
	 
		
	}
}
