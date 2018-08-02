package com.deloitte.main;

import com.deloitte.daos.UserDAO;
import com.deloitte.jdbc.User;

public class MainClass {

	public static void main(String[] args) {
		UserDAO udao = new UserDAO();
		User user = new User(1,"Olivia","Olivia","pass#123","E");
		
		udao.save(user);

	}

}
