package com.edu.training.js.airline.main;

import java.util.GregorianCalendar;
import java.util.Calendar;

import com.edu.training.js.airline.entity.Airline;
import com.edu.training.js.airline.entity.AirlineSchedule;
import com.edu.training.js.airline.entity.Airplane;
import com.edu.training.js.airline.filters.Filters;
import com.edu.training.js.airline.print.Print;

public class main {

	public static void main(String[] args) {

		Airplane one = new Airplane("bel-333", "Boing 777", 250, 5500);
		Airplane two = new Airplane("bel-334", "Boing 666", 450, 5500);
		Airplane three = new Airplane("bel-335", "Boing 555", 150, 5500);
		Airplane four = new Airplane("bel-336", "Airbus A340", 350, 5500);
		Airplane five = new Airplane("bel-337", "Boing 757", 270, 7500);
		Airplane six = new Airplane("bel-338", "Stupa 1", 1, 850);
		Airplane seven = new Airplane("bel-338", "Metla 13", 1, 480);

		AirlineSchedule Minsk = new AirlineSchedule("Minsk");

		Minsk.addAirline(new Airline("msk-154", one, "Moskow", new GregorianCalendar(0, 0, 0, 15, 45, 00),
				new int[] { 1, 5, 6 }));
		Minsk.addAirline(
				new Airline("brl-1154", two, "Berlin", new GregorianCalendar(0, 0, 0, 23, 15, 00), new int[] { 1, 6 }));
		Minsk.addAirline(new Airline("spb-333", three, "Peterburg", new GregorianCalendar(0, 0, 0, 5, 45, 00),
				new int[] { 1, 2, 3, 4, 5, 6, 7 }));
		Minsk.addAirline(
				new Airline("hzp-13", six, "Hazapetovka", new GregorianCalendar(0, 0, 0, 13, 13, 13), new int[] { 1 }));
		Minsk.addAirline(new Airline("msk-254", four, "Moskow", new GregorianCalendar(0, 0, 0, 9, 45, 00),
				new int[] { 1, 2, 6 }));
		Minsk.addAirline(new Airline("msk-354", five, "Moskow", new GregorianCalendar(0, 0, 0, 1, 45, 00),
				new int[] { 3, 5, 6 }));
		Minsk.addAirline(new Airline("msk-155", seven, "Moskow", new GregorianCalendar(0, 0, 0, 15, 45, 00),
				new int[] { 4, 5, 6 }));
		Minsk.addAirline(new Airline("msk-156", one, "Moskow", new GregorianCalendar(0, 0, 0, 15, 45, 00),
				new int[] { 2, 5, 6 }));
		Minsk.addAirline(new Airline("msk-157", two, "Moskow", new GregorianCalendar(0, 0, 0, 15, 45, 00),
				new int[] { 3, 5, 6 }));
		Minsk.addAirline(new Airline("msk-159", one, "Moskow", new GregorianCalendar(0, 0, 0, 15, 45, 00),
				new int[] { 1, 5, 6 }));
		Minsk.addAirline(new Airline("msk-1994", two, "Moskow", new GregorianCalendar(0, 0, 0, 15, 45, 00),
				new int[] { 4, 5, 6 }));
		Minsk.addAirline(new Airline("msk-194", one, "Moskow", new GregorianCalendar(0, 0, 0, 1, 45, 00),
				new int[] { 4, 5, 6 }));
		Minsk.addAirline(new Airline("msk-134", five, "Moskow", new GregorianCalendar(0, 0, 0, 15, 45, 00),
				new int[] { 1, 5, 6 }));
		Minsk.addAirline(new Airline("psk-154", one, "Pskov", new GregorianCalendar(0, 0, 0, 19, 30, 00),
				new int[] { 1, 5, 6 }));
		Minsk.addAirline(
				new Airline("msk-54", six, "Moskow", new GregorianCalendar(0, 0, 0, 15, 45, 00), new int[] { 5, 6 }));

		String destination = "Moskow"; // для первого пункта задачи, установка пункта назначения
		int dayOne = 5; // для второго пункта задания, устиановка дня полета
		int dayTwo = 3; // для третьего пункта задания, установка дня полета
		Calendar time = new GregorianCalendar(0, 0, 0, 10, 33, 00);// для третьего пункта, установка времени
		Print p = new Print();
		// p.printSchedule(Minsk);

		Filters f = new Filters();
		System.out.println("Выбираем по пункту назначения - " + destination);
		p.printSchedule(f.findDestination(Minsk, destination));

		System.out.println("Выбираем по дню полёта  - " + p.convertIndexToNameDay(dayOne));

		p.printSchedule(f.findAirlinesOfDay(Minsk, dayOne));

		System.out.println("Выбираем по дню полёта  - " + p.convertIndexToNameDay(dayTwo) + ", и времени отправления - "
				+ Filters.departureTimeConvertToSecond(time));

		p.printSchedule(f.findAfterTime(f.findAirlinesOfDay(Minsk, dayTwo), time));
	}
}
