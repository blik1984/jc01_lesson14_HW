package com.edu.training.js.airline.filters;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.edu.training.js.airline.entity.Airline;
import com.edu.training.js.airline.entity.AirlineSchedule;

public class Filters {

	public List<Airline> findDestination(AirlineSchedule schedule, String destination) {
		List<Airline> result = new ArrayList<>();
		for (int i = 0; i < schedule.getSchedule().size(); i++) {
			if (schedule.getSchedule().get(i).getDestination().equalsIgnoreCase(destination)) {
				result.add(schedule.getSchedule().get(i));
			}
		}
		return result;
	}

	public List<Airline> findDestination(List<Airline> schedule, String destination) {
		List<Airline> result = new ArrayList<>();
		for (int i = 0; i < schedule.size(); i++) {
			if (schedule.get(i).getDestination().equalsIgnoreCase(destination)) {
				result.add(schedule.get(i));
			}
		}
		return result;
	}

	public List<Airline> findAirlinesOfDay(AirlineSchedule schedule, int dayOfWeek) {
		List<Airline> result = new ArrayList<>();
		for (int i = 0; i < schedule.getSchedule().size(); i++) {
			int[] days = schedule.getSchedule().get(i).getFlightDays();
			for (int j = 0; j < days.length; j++) {
				if (days[j] == dayOfWeek) {
					result.add(schedule.getSchedule().get(i));
					break;
				}
			}
		}
		return result;
	}

	public List<Airline> findAirlinesOfDay(List<Airline> schedule, int dayOfWeek) {
		List<Airline> result = new ArrayList<>();
		for (int i = 0; i < schedule.size(); i++) {
			int[] days = schedule.get(i).getFlightDays();
			for (int j = 0; j < days.length; j++) {
				if (days[j] == dayOfWeek) {
					result.add(schedule.get(i));
					break;
				}
			}
		}
		return result;
	}

	public List<Airline> findAfterTime(AirlineSchedule schedule, Calendar time) {
		List<Airline> result = new ArrayList<>();
		for (int i = 0; i < schedule.getSchedule().size(); i++) {
			int airlineTime = departureTimeConvertToSecond(schedule.getSchedule().get(i).getDepartureTime());
			if (departureTimeConvertToSecond(time) < airlineTime) {
				result.add(schedule.getSchedule().get(i));
				break;

			}
		}
		return result;
	}
	public List<Airline> findAfterTime(List<Airline> schedule, Calendar time) {
		List<Airline> result = new ArrayList<>();
		for (int i = 0; i < schedule.size(); i++) {
			int airlineTime = departureTimeConvertToSecond(schedule.get(i).getDepartureTime());
			if (departureTimeConvertToSecond(time) < airlineTime) {
				result.add(schedule.get(i));
				break;

			}
		}
		return result;
	}
	public static int departureTimeConvertToSecond(Calendar time) {
		int result = time.get(Calendar.SECOND) + time.get(Calendar.MINUTE) * 60 + time.get(Calendar.HOUR_OF_DAY) * 3600;
		return result;
	}
}
