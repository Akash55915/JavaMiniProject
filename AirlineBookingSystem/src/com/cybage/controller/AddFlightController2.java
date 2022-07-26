package com.cybage.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Flight;
import com.cybage.service.AdminService;
import com.cybage.service.AdminServiceImpl;

/**
 * Servlet implementation class AddFlightController2
 */
@WebServlet("/AddFlightController2")
public class AddFlightController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFlightController2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int flight_No=Integer.parseInt(request.getParameter("flight_No"))	;
		int flight_total_no_seats=Integer.parseInt(request.getParameter("flight_total_no_seats"))	;
		int flight_avaliable_seats=Integer.parseInt(request.getParameter("flight_avaliable_seats"))	;
		int flight_price=Integer.parseInt(request.getParameter("flight_price"))	;
		String flight_name=request.getParameter("flight_name");
		String flight_source=request.getParameter("flight_source");
		String flight_destination=request.getParameter("flight_destination");
		String flight_type=request.getParameter("flight_type");
		
		System.out.println("source"+flight_source);
	//	String flight_time=request.getParameter("flight_type");
		Time flight_time=new Time(12, 20,30);
	//String flight_date=request.getParameter("flight_date");
Date date=null;

java.sql.Date sqlDate=null;
		 java.util.Date date3 = null;
		try {
			date3 = new SimpleDateFormat("MM-dd-yyyy").parse(request.getParameter("flight_date"));
		 sqlDate = new java.sql.Date(date3.getTime());

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//
//	        // 2)Create a new DateFormat("yyyy-MM-dd") - For mySQL format
//	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//	        // 3)Convert my Date obj into String, and change to ("yyyy-MM-dd") format
//
//	        String myStringdate = sdf.format(date1);
//
//	        // 4)Convert String back to date obj
//
//	        Date finishedDate = null;
//			try {
//				finishedDate = (Date)sdf.parse(myStringdate);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//	        // 5)Convert to localDate
//	 //      LocalDate dueDate = finishedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//	        // 6)Send to MYSQL database. 
//	        //Initial user html input = 01/19/1993, 
//	        //date entered in mysql database = 0184-12-31
//		
//		
//		
//		   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//           java.util.Date date2 = (Date) formatter.parse(request.getParameter("origionalAirDate"));
//          
//           java.sql.Date sqlDate = new java.sql.Date(date2.getTime());
//           String string = "2011-03-22";
//           Date date1 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(string);
		Flight flight=new Flight(flight_No, flight_total_no_seats, flight_avaliable_seats, flight_price, flight_name, flight_source, flight_destination, flight_type, flight_time, sqlDate);
			
		System.out.println(flight);
			AdminService adminService=new AdminServiceImpl();
			adminService.addFlight(flight);
			response.sendRedirect("AdminHomePage.jsp");
		}
	
}
