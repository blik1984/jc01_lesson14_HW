package com.edu.training.js.airline.print;

import java.util.Calendar;
import java.util.List;
import com.edu.training.js.airline.entity.Airline;
import com.edu.training.js.airline.entity.AirlineSchedule;

public class Print {

	public void printSchedule(AirlineSchedule schedule) {
		for (int i = 0; i < schedule.getSchedule().size(); i++) {
			printAirline(schedule.getSchedule().get(i));
		}

	}

	public void printSchedule(List<Airline> schedule) {
		for (int i = 0; i < schedule.size(); i++) {
			printAirline(schedule.get(i));
		}

	}

	public void printAirline(Airline airline) {

		System.out.println("Номер рейса - " + airline.getFlightNumber() + "\nНа чём плетим - "
				+ airline.getAirplane().getModel() + "\nКуда полетим - " + airline.getDestination()
				+ "\nВо сколько полетим - " + airline.getDepartureTime().get(Calendar.HOUR_OF_DAY) + " : "
				+ airline.getDepartureTime().get(Calendar.MINUTE) + "\nПо каким дням полетим:\n"
				+ convertIndexToNameDay(airline.getFlightDays()));
	}

	public String convertIndexToNameDay(int[] days) {
		String result = "";
		for (int i = 0; i < days.length; i++) {
			if (days[i] == 1) {
				result += "Понедельник\n";
			} else if (days[i] == 2) {
				result += "Вторник\n";
			} else if (days[i] == 3) {
				result += "Среда\n";
			} else if (days[i] == 4) {
				result += "Четверг\n";
			} else if (days[i] == 5) {
				result += "Пятница\n";
			} else if (days[i] == 6) {
				result += "Суббота\n";
			} else if (days[i] == 7) {
				result += "Воскресенье\n";
			}
		}
		return result;
	}
	public String convertIndexToNameDay(int day) {
		String result = "";

			if (day == 1) {
				result += "Понедельник\n";
			} else if (day == 2) {
				result += "Вторник\n";
			} else if (day == 3) {
				result += "Среда\n";
			} else if (day == 4) {
				result += "Четверг\n";
			} else if (day == 5) {
				result += "Пятница\n";
			} else if (day == 6) {
				result += "Суббота\n";
			} else if (day == 7) {
				result += "Воскресенье\n";
			}
		
		return result;
	}
}
