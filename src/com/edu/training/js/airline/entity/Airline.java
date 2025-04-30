package com.edu.training.js.airline.entity;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Airline {
	
	private final String flightNumber;
	private Airplane airplane;
	private String destination;
	private Calendar departureTime;
	private int[] flightDays;
	
	public Airline(String flightNumber) {
		
		this.flightNumber = flightNumber;
		
	}
	
	public Airline(String flightNumber, Airplane airplane, String destination, Calendar departureTime, int[] flightDays) {
		
		this.flightNumber = flightNumber;
		this.airplane = airplane;
		this.destination = destination;
		this.departureTime = departureTime;
		this.flightDays = flightDays;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Calendar getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Calendar departureTime) {
		this.departureTime = departureTime;
	}

	public int[] getFlightDays() {
		return flightDays;
	}

	public void setFlightDays(int[] flightDays) {
		this.flightDays = flightDays;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(flightDays);
		result = prime * result + Objects.hash(airplane, departureTime, destination, flightNumber);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(airplane, other.airplane) && Objects.equals(departureTime, other.departureTime)
				&& Objects.equals(destination, other.destination) && Arrays.equals(flightDays, other.flightDays)
				&& Objects.equals(flightNumber, other.flightNumber);
	}

	@Override
	public String toString() {
		return "Airline [flightNumber=" + flightNumber + ", airplane=" + airplane + ", destination=" + destination
				+ ", departureTime=" + departureTime + ", flightDays=" + Arrays.toString(flightDays) + "]";
	}
	
	

}
