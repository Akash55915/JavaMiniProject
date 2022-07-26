package com.cybage.service;

import java.util.List;

import com.cybage.dao.FlightDao;
import com.cybage.dao.FlightDaoImpl;
import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.Flight;

public class FlightServiceImpl implements FlightService{

	@Override
	public List<Flight> getAllFlight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight getFlightById(int flight_No) {
	FlightDao dao=new FlightDaoImpl();
	return dao.getFlightById(flight_No);
		
	
	}

}
