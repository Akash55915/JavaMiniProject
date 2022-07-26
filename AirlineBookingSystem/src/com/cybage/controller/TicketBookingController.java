package com.cybage.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.Booking;
import com.cybage.model.Flight;
import com.cybage.model.User;
import com.cybage.service.AdminService;
import com.cybage.service.AdminServiceImpl;
import com.cybage.service.BookingService;
import com.cybage.service.BookingServiceImpl;
import com.cybage.service.FlightService;
import com.cybage.service.FlightServiceImpl;
import com.cybage.service.UserServices;
import com.cybage.service.UserServicesImpl;

/**
 * Servlet implementation class TicketBookingController
 */
@WebServlet("/TicketBookingController")
public class TicketBookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketBookingController() {
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
	   // int	booking_id=20;
	    HttpSession session=request.getSession();
	    User user1= (User) session.getAttribute("user");
		int user_id=user1.getUser_id();
		int flight_No=Integer.parseInt(request.getParameter("flight_No"))	;
		int flight_avaliable_seats=Integer.parseInt(request.getParameter("no_of_seats"))	;
		
		String flights_class_name=request.getParameter("flights_class_name");
		//Date date=null;
//
	FlightService flightService=new FlightServiceImpl();
	Flight flight= flightService.getFlightById(flight_No);
//		Flight flight= flightService.getFlightById(6000);
//	System.out.println(flight);
		UserServices userService=new UserServicesImpl();
		User user= userService.getUserById(user_id);
	System.out.println(user);
		int ticket_price=50000;
		String booking_date=null;
		System.out.println("From ticket controller");
		
		Booking booking_obj=new Booking( ticket_price, flight, user, booking_date, flights_class_name, true);
	
		BookingService bookingService=new BookingServiceImpl();
	bookingService.addBooking(booking_obj);
		

			
		response.sendRedirect("ConfirmTicket.jsp");
		   
	}

}
