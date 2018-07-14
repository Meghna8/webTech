package com.ourWeb.connection;

import java.sql.*;
public class DBConnection {

    public boolean check(String email, String pass) {
        String sql = "select * from login where email=? and pass=?";
        Connection Conn = null;
        String user = "root1";
        String password = "root";
        
        try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		
	}
        System.out.println("MySQL JDBC Driver Registered!");

        try {
            // 1. Get a connection to database
            System.out.println("connection testing");
            Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", user, password);
            System.out.println("connected");
            // 2. Create a statement
            PreparedStatement stmt = Conn.prepareStatement(sql);
            stmt.setString(1,email);
            stmt.setString(2,pass);
            ResultSet rs = stmt.executeQuery();

         
           
//process rs
            while (rs.next()) {
                System.out.println(rs.getString("email")); //this email value we got from database
                return true;
            }
} catch (Exception exc) {
            exc.printStackTrace();
            } 
return false;
    }
}

    


