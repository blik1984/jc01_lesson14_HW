package com.edu.training.js.airline.entity;

import java.util.ArrayList;
import java.util.List;

public class AirlineSchedule {

	private final String airportName;
	private List<Airline> schedule;

	public AirlineSchedule(String airportName) {
		this.airportName = airportName;
		this.schedule = new ArrayList<>();
	}

	public AirlineSchedule(String airportName, List<Airline> schedule) {
		this.airportName = airportName;
		this.schedule = schedule;
	}

	public List<Airline> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Airline> schedule) {
		this.schedule = schedule;
	}

	public String getAirportName() {
		return airportName;
	}

	public void addAirline(Airline line) {
		schedule.add(line);
	}

	public boolean deleteAirline(String flightNumber) {

		int indexAirline = findIndexAirline(flightNumber);

		if (indexAirline >= 0) {
			schedule.remove(indexAirline);
			return true;
		}
		return false;
	}

	public int findIndexAirline(String flightNumber) {

		for (int i = 0; i < schedule.size(); i++) {
			if (schedule.get(i).getFlightNumber().equals(flightNumber)) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(airportName, schedule);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirlineSchedule other = (AirlineSchedule) obj;
		return Objects.equals(airportName, other.airportName) && Objects.equals(schedule, other.schedule);
	}

	@Override
	public String toString() {
		return "AirlineSchedule [airportName=" + airportName + ", schedule=" + schedule + "]";
	}
	
}
