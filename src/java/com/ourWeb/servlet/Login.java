/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourWeb.servlet;

import com.ourWeb.connection.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Meghna
 */
public class Login extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
         String email=request.getParameter("email");
         String pass= request.getParameter("pass");
         DBConnection db = new DBConnection();
         if(db.check(email,pass)) //if it is true the sendRedirect("welcome.jsp")
         {
             HttpSession session = request.getSession(); //to get the session and store the emailID until logout
             session.setAttribute("emailID",email);   //email value is set to emailID
             response.sendRedirect("welcome.jsp");
         }
         else
         {
             response.sendRedirect("login.jsp");
         }
}
}
        
