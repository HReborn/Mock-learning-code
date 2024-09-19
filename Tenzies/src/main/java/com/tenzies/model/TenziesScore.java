package com.tenzies.model;

public class TenziesScore {
	private String userId;
	private String username;
	private String password;
	private String email;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public TenziesScore(String userId, String username, String password, String email) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "TenziesScore [userId=" + userId + ", username=" + username + ", password=" + password + ", email="
				+ email + "]";
	}
	
	
}
