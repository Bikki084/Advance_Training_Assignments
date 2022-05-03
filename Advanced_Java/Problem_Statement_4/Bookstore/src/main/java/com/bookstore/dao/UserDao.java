package com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bookstore.db.jdbcconnection;
import com.bookstore.entity.User;

public class UserDao {

//	method to insert in database
	public boolean saveUser(User user) {
		Connection con = new jdbcconnection().getConnection();
		boolean f = false;

		try {
			String query = "insert into users(first_name,address,email,user_name,password)values (?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, user.getFirst_name());
			pstmt.setString(2, user.getAddress());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getUname());
			pstmt.setString(5, user.getPass());

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public User getUserByUnameAndPassword(String uname, String password) {
		User user = null;
		Connection con = new jdbcconnection().getConnection();
		try {
			String query = "select * from users where user_name=? and password=?";

			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, uname);
			psmt.setString(2, password);

			ResultSet set = psmt.executeQuery();

			while (set.next()) {
				user = new User();
				// data from db
				user.setFirst_name((String)set.getObject("first_name"));
				// set to user object
				user.setAddress((String)set.getObject("address"));
				user.setEmail((String)set.getObject("email"));
				user.setUname((String)set.getObject("user_name"));
				user.setPass((String)set.getObject("password"));
				user.setRegdate((String)set.getObject("registration_date").toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("this is from userDAo\n"+user);
		return user;
	}

}
