package com.capgemini.quote.bean;

import javax.persistence.*;

@Entity
@Table(name = "userrole")
public class User 
{
	@Id
	public String userName;
	public String password;
	public String roleCode;
	public User() {
		super();
	}
	public User(String userName, String password, String rollCode) {
		super();
		this.userName = userName;
		this.password = password;
		this.roleCode = rollCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRollCode() {
		return roleCode;
	}
	public void setRollCode(String rollCode) {
		this.roleCode = rollCode;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", rollCode=" + roleCode + "]";
	}
	
	
	
}
