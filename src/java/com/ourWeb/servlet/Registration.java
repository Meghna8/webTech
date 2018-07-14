
package com.ourWeb.servlet;

import com.ourWeb.connection.DBConnection;
import com.ourWeb.dao.employeeDAO;
import com.ourWeb.dto.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Registration extends HttpServlet {

 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //retrieve data from jsp page    
   // int empID = Integer.parseInt(request.getParameter("empID"));
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String emailID = request.getParameter("email");
    String uname = request.getParameter("uname");
    String pass = request.getParameter("pass");
   // double salary = Double.parseDouble(request.getParameter("salary"));
    String designation = request.getParameter("designation");
    String team = request.getParameter("team");
    String contact = request.getParameter("contact");
    
    //set all the values in model class object
    
    Employee emp=new Employee();
//    //emp.setEmpID(empID);
    emp.setFirstname(firstname);
    emp.setLastname(lastname);
    emp.setEmailID(emailID);
    emp.setUname(uname);
    emp.setPass(pass);
    //emp.setSalary(salary);
    emp.setDesignation(designation);
    emp.setTeam(team);
    emp.setContact(contact);
    
    
    //call a method in dao class to insert the data into table
    
    String sql="insert into employee values(?,?,?,?,?,?,?,?,?)";
    System.out.println("hi");
    int i = employeeDAO.insertEmployee(emp,sql);
    
    if(i!=0)
    {
         System.out.println("Value inserted");
    }
    else{
    
         System.out.println("Value not inserted");
    }
    

    }
}