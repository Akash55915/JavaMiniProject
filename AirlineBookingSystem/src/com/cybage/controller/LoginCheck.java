package com.cybage.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.Login;
import com.cybage.model.User;

import com.cybage.service.UserServices;
import com.cybage.service.UserServicesImpl;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet({ "/LoginCheck", "/logincheck" })
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserServices userService= new UserServicesImpl();
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String email=request.getParameter("user_email");
		 String password=request.getParameter("user_password");
		 
		 Login login = new Login(email, password);
		 
		 User user= userService.getUser(login);
		
		if(user!=null) {
			System.out.println(user);
			HttpSession session= request.getSession();
			session.setAttribute("user", user);
			session.setAttribute("user_id", user.getUser_id());
			session.setAttribute("user_name", user.getUser_name());
			session.setAttribute("user_contact", user.getUser_contact());
			session.setAttribute("user_address", user.getUser_address());
			session.setAttribute("user_gender", user.getUser_gender());
			session.setAttribute("user_email", user.getUser_email());
			session.setAttribute("user_password", user.getUser_password());
			session.setAttribute("user_role", user.getUser_role());
			session.setAttribute("user_age", user.getUser_age());
			
			
			String role=user.getUser_role();
			
			System.out.println("redirect to repective home page");
			
			if(role.equals("user")) {
				System.out.println("redirect to user home page....");
				response.sendRedirect("UserHomePage.jsp");
				
			}else {
				System.out.println("redirect to Admin home page...");
				response.sendRedirect("AdminHomePage.jsp");
			}
				
		}else {
			System.out.println("Invalid user .... redirect to login page");
			response.sendRedirect("Login.jsp");
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
