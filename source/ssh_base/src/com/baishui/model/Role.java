package com.baishui.model;

 
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Role {
	
	private String  id;
	private String roleName;
	private List<Users> users;
	 
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	@OneToMany(mappedBy="role",cascade={CascadeType.ALL},fetch=FetchType.LAZY)  //在 user表添加外键关联 ，设置级联属性  读取操作为 lazy
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	 
	
	

}
