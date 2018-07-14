package com.ourWeb.connection;

//import com.ourWeb.dto.Employee;
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
            stmt.setString(1, email);
            stmt.setString(2, pass);
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

    public static Connection connect() {
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
         }
          catch (Exception exc) {
            exc.printStackTrace();
        }
       
        return Conn;
    }
    
//   public boolean insertEmployee(String uname) {
//        String sql1="insert into employee values(?,?,?,?,?,?,?,?,?)";
//        Connection Conn = null;
//        String user = "root1";
//        String password = "root";
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Where is your MySQL JDBC Driver?");
//            e.printStackTrace();
//
//        }
//        System.out.println("MySQL JDBC Driver Registered!");
//
//        try {
//            // 1. Get a connection to database
//            System.out.println("connection testing");
//            Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", user, password);
//            System.out.println("connected");
//            // 2. Create a statement
//            PreparedStatement stmt = Conn.prepareStatement(sql1);
//           stmt.setString(1,emp.getFirstname());
//           stmt.setString(2,emp.getLastname());
//           stmt.setString(3,emp.getEmailID());
//           stmt.setString(4,emp.getUname());
//           stmt.setString(5,emp.getPass());
//           stmt.setDouble(6, emp.getSalary());
//           stmt.setString(7,emp.getDesignation());
//           stmt.setString(8,emp.getTeam());
//           stmt.setString(9,emp.getContact());
//           ResultSet rs = stmt.executeQuery();
//
////process rs
//           while (rs.next()) {
//                System.out.println(rs.getString("value inserted")); //this email value we got from database
//                return true;
//            }
//        } catch (Exception exc) {
//            exc.printStackTrace();
//        }
//        return false;
//    }
}


