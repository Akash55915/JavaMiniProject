package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.model.Feedback;


public class AddFeedbackImpl implements AddFeedback {

	Connection connection=JDBCUtility.getConncetion();
	PreparedStatement preparedStatement=null;
	@Override
	public boolean addFeedback(Feedback feedback) {
		
		 try {
			preparedStatement=connection.prepareStatement("insert into rating(rating_rating,"
					+ "description,booking_id) values(?,?,?)");
			 preparedStatement.setInt(1, feedback.getRating_rating());
			  preparedStatement.setString(2, feedback.getDescription());
			  preparedStatement.setInt(3, feedback.getBooking_id());
			  
			 
			  preparedStatement.execute();
			  
			  System.out.println("Rating is submitted...");
			  
			  return true;
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
