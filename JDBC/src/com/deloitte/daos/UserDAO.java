package com.deloitte.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.jdbc.Dao;
import com.deloitte.jdbc.User;


public class UserDAO implements Dao<User>{

	@Override
	public User get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		Connection connection= null;
		PreparedStatement ps= null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "olivia", "team3db");
			ps=connection.prepareStatement("Insert into users values(?,?,?,?,?)");
			ps.setInt(1, user.getUser_id());
			ps.setString(2, user.getUser_name());
			ps.setString(3, user.getF_name());
		
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getStatus());
			
			ps.executeUpdate();
			ps.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				if(ps!= null && !ps.isClosed()) {
					ps.close();
				}
				if(connection!=null && !ps.isClosed()) {
					connection.close();
				}
				
			}
			catch (SQLException e){
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void update(User t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User t) {
		// TODO Auto-generated method stub
		
	} 

}
