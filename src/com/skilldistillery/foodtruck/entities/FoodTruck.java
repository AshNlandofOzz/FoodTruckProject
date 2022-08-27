package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private int numericID;
	private String name;
	private String foodType;
	private int numericRating;


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


public void setNumericRating(int numericRating) {
	this.numericRating = numericRating;
}
}