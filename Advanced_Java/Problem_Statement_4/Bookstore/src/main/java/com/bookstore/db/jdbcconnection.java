package com.bookstore.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcconnection {
	private static Connection con;

	public Connection getConnection() {
		Connection con  = null;
		try {
			
			if (con == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore",
						"root", "root");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
