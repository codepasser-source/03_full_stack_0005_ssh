package com.baishui.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.baishui.model.Users;
import com.baishui.service.UsersManager;
import com.opensymphony.xwork2.ActionSupport;


@Component(value="usersAction")
@Scope(value="prototype") 
public class UsersAction extends ActionSupport   {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private UsersManager usersManager;
    private Users user = new Users();

	public UsersManager getUsersManager() {
		return usersManager;
	}

    //struts2 spring pulg in 自动按 命名注入
	@Resource(name="usersManager")
	public void setUsersManager(UsersManager usersManager) {
		this.usersManager = usersManager;
	}
	 
	public Users getUser() {
		return user;
	} 
	public void setUser(Users user) {
		this.user = user;
	}


	public String addUser() { 
		try { 
			
			System.out.println(this.user.getId()+"==="+this.user.getUsername()+"==="+this.user.getRole().getId());
			this.usersManager.addUser(user);
			
		} catch (Exception e) {
			 e.printStackTrace();
			 return "input";
		}
		return  "success";
	}
	
	public String deleteUser(){
         try { 
			 
			this.usersManager.deleteUser(this.user);
			
		} catch (Exception e) {
			 e.printStackTrace();
			 return "input";
		}
		return  "success";
		
	}
	

}
