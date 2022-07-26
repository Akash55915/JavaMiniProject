package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.User;

import com.cybage.service.UserServices;
import com.cybage.service.UserServicesImpl;

/**
 * Servlet implementation class Registration
 */
@WebServlet({ "/Registration", "/registration" })
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserServices userService= new UserServicesImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 String name=request.getParameter("user_name");
		 String email=request.getParameter("user_email");
		 String password=request.getParameter("user_password");
		 String contact=request.getParameter("user_contact");
		 String address=request.getParameter("user_address");
		 int age=Integer.parseInt(request.getParameter("user_age"));
		 String gender=request.getParameter("user_gender");
		// String role=request.getParameter("user_role");
		 
		 User user=new User( name, email, password, contact, address, age, gender);
		 System.out.println(user);
		 
	boolean flag=userService.addUser(user);
	if(flag) {
		System.out.println("user added succefully....");
		response.sendRedirect("Login.jsp");
	}else {
		System.out.println("duplicate entry");
		response.sendRedirect("registration.jsp");
		
	}
			 
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
