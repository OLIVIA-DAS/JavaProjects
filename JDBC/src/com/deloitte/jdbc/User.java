package com.deloitte.jdbc;

public class User {
	private int user_id;
	private String user_name;
	
	private String f_name;

	private String password;
	private String status;
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User(int user_id, String user_name, String f_name,  String password, String status) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.f_name = f_name;
		
		this.status = status;
	}

}
