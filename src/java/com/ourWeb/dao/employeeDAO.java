package com.ourWeb.dao;


import com.ourWeb.connection.DBConnection;
import static com.ourWeb.connection.DBConnection.connect;
import com.ourWeb.dto.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class employeeDAO {

    private static Connection connect()
    {
        Connection conn=null;
        String user = "root1";
        String password = "root";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", user, password);
            System.out.println("Connected");
            
        
        }
        catch(Exception ex){
        ex.printStackTrace();
        
        }
        return conn;
    }
    
   public static int insertEmployee(Employee emp, String sql) {
      
           int i=0;
           Connection Conn = connect();
           try{
           PreparedStatement ps = Conn.prepareStatement(sql);
           ps.setInt(1,emp.getEmpID());
           ps.setString(2,emp.getFirstname());
           ps.setString(3,emp.getLastname());
           ps.setString(4,emp.getEmailID());
           ps.setString(5,emp.getUname());
           ps.setString(6,emp.getPass());
         //  ps.setDouble(7, emp.getSalary());
           ps.setString(7,emp.getDesignation());
           ps.setString(8,emp.getTeam());
           ps.setString(9,emp.getContact());
           
           i=ps.executeUpdate();
           }
           catch(Exception ex){
               ex.printStackTrace();
            }
           return i;      
       }
   }
