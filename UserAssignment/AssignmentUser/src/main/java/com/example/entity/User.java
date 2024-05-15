package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
	   @Id
	   private int userId;
	   private String userNm;
	   private int password;
	   private String role;
	   
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userNm, int password, String role) {
		super();
		this.userId = userId;
		this.userNm = userNm;
		this.password = password;
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userNm=" + userNm + ", password=" + password + ", role=" + role + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	   
	
	   
	   
	   
}
