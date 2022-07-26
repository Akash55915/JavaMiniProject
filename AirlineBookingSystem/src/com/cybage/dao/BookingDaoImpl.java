package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.model.Booking;

public class BookingDaoImpl implements BookingDao {



	
	@Override
	public void addBooking(Booking booking) {
		Connection connection=JDBCUtility.getConncetion();
		try {
			
			  PreparedStatement preparedStatement=connection.prepareStatement("insert into booking values(?,?,?,?,?,?,?);");
			  
			  preparedStatement.setInt(1, booking.getBooking_id());
			  preparedStatement.setBoolean(2, booking.isStatus());
			  preparedStatement.setInt(3, booking.getFlight_No().getFlight_No());
			  preparedStatement.setString(4, booking.getFlight_class());
			  
			  preparedStatement.setInt(5,booking.getTicket_price());
			  preparedStatement.setInt(6, booking.getUser_id().getUser_id());
			  preparedStatement.setString(7,booking.getBookingDate());
			  
			  preparedStatement.execute();
			  connection.close();
			  System.out.println("Ticket Book successfully");
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteBookingById(int booking_id) {
		// TODO Auto-generated method stub
		
	}
	}

	




