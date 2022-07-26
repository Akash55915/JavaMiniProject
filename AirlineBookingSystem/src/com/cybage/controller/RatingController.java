package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.Feedback;
import com.cybage.service.AddFeedbackService;
import com.cybage.service.AddFeedbackServiceImpl;

/**
 * Servlet implementation class RatingController
 */
@WebServlet({ "/RatingController", "/rating" })
public class RatingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RatingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		AddFeedbackService feedbackService=new AddFeedbackServiceImpl();
		HttpSession session=request.getSession();
		int rating=Integer.parseInt(request.getParameter("rating_rating"));
		String description=request.getParameter("description");
		
		int booking_id=70;
		Feedback feedback=new Feedback(rating, description, booking_id);
		
		boolean flag = feedbackService.addFeedback(feedback);
		if(flag) {
           System.out.println("Rating is sumbitted...");
           response.sendRedirect("UserHomePage.jsp");
		}else {
			 System.out.println("Rating is not sumbitted...");
	         response.sendRedirect("UserHomePage.jsp");
			
		}
	}

}
