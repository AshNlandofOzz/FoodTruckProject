package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int count = 1;
	private String name;
	private String foodType;
	private double numericRating;
	private int numericID;

	public int getNumericID() {
		return numericID;
	}

	public void setNumericID(int numericID) {
		this.numericID = numericID;
	}

	public FoodTruck(String name, String foodType, double numericRating) {
		this.name = name;
		this.foodType = foodType;
		this.numericRating = numericRating;
		this.numericID = count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}


	public double getNumericRating() {
		return numericRating;
	}

	public void setNumericRating(double numericRating) {
		this.numericRating = numericRating;
	}

	public String toString() {
		String output = "Food Truck Name: " + name + "\nFood Type: " + foodType + "\nNumericRating: " + numericRating
				+ "\nNumeric ID: " + numericID + "\n\n" ;
		return output;
	}

	public void foodTruckData() {
		String truckData = this.toString();
		System.out.println(truckData);
	}

	public String stringName() {
		String output = "Food Truck Name: " + name + "\n";
		return output;
	}

}