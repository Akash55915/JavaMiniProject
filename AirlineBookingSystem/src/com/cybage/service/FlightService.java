package com.cybage.service;

import java.util.List;

import com.cybage.model.Flight;

public interface FlightService {
	List<Flight> getAllFlight();
	Flight getFlightById(int flight_No);
}
