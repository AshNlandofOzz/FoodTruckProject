package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private int numericID;
	private String name;
	private String foodType;
	private double numericRating;


public FoodTruck(String name, String foodType, int numericRating) {
	this.name = name;
	this.foodType = foodType;
	this.numericRating = numericRating;
}

public FoodTruck(String name, String foodType, int numericRating, int numericID) {
	this(name, foodType, numericRating);
	this.numericID = numericID;
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


public void setFoodType(String foodType) {
	this.foodType = foodType;
}


public double getNumericRating() {
	return numericRating;
}


public void setNumericRating(double numericRating) {
	this.numericRating = numericRating;
}

public String toString() {
	String output = "Food Truck Name: " + name + "\n Food Type: " + foodType + "\nNumericRating: " + numericRating;
	return output;
}

public void foodTruckData() {
	String truckData = this.toString();
	System.out.println(truckData);
}

public String stringName() {
	String output = "Food Truck Name: " + name + " ";
	return output;
}

//public void listOfNames() {
//	String listNames = this.stringName();
//	System.out.println(listNames);
//}
}