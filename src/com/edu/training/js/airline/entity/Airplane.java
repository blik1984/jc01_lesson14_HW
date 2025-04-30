package com.edu.training.js.airline.entity;

import java.util.Objects;

public class Airplane {

	final private String registrationPlate;
	private String model;
	private int numberOfPassengers;
	private int flightRange;

	public Airplane(String registrationPlate) {

		this.registrationPlate = registrationPlate;

	}

	public Airplane(String registrationPlate, String model, int numberOfPassengers, int flightRange) {

		this.registrationPlate = registrationPlate;
		this.model = model;
		this.numberOfPassengers = numberOfPassengers;
		this.flightRange = flightRange;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getFlightRange() {
		return flightRange;
	}

	public void setFlightRange(int flightRange) {
		this.flightRange = flightRange;
	}

	public String getRegistrationPlate() {
		return registrationPlate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flightRange, model, numberOfPassengers, registrationPlate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		return flightRange == other.flightRange && Objects.equals(model, other.model)
				&& numberOfPassengers == other.numberOfPassengers
				&& Objects.equals(registrationPlate, other.registrationPlate);
	}

	@Override
	public String toString() {
		return "Airplane [registrationPlate=" + registrationPlate + ", model=" + model + ", numberOfPassengers="
				+ numberOfPassengers + ", flightRange=" + flightRange + "]";
	}

}
