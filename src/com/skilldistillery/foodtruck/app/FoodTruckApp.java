package com.skilldistillery.foodtruck.app;

import java.util.*;
import com.skilldistillery.foodtruck.entities.*;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruckApp ourFoodTruckApp = new FoodTruckApp();
		ourFoodTruckApp.Welcome();

		Scanner scan = new Scanner(System.in);
		String userInName, userInType;
		int userInRating;
		int numTrucks = 0;
		int MAX_INPUT = 5;
		FoodTruck[] trucks = new FoodTruck[MAX_INPUT];
		do {
			System.out.print("Name: ");
			userInName = scan.next();
			if (userInName.equalsIgnoreCase("quit")) {
				break;
			} 
			System.out.println("Food Type: ");
			userInType = scan.next();
			System.out.println("Rating on scale 1 to 5 (Ate 1 and done, could easily eat 5-the best): ");
			userInRating = scan.nextInt();
			while (userInRating > 5) {
				System.out.println("That is not a valid rating");
				System.out.println("Rating on scale 1 to 5 (Ate 1 and done, could easily eat 5-the best): ");
				userInRating = scan.nextInt();
			}
			trucks[numTrucks] = new FoodTruck(userInName, userInType, userInRating); 
			numTrucks++;
		} while (numTrucks < MAX_INPUT);

		int option = 0;
		while (option != 4) {
			System.out.println("Please select an option: ");
			ourFoodTruckApp.MainMenu();
			option = scan.nextInt();
			switch (option) {
			case 1:
				ourFoodTruckApp.listTrucks(trucks, numTrucks);
				break;
			case 2:
				ourFoodTruckApp.calculateAverage(trucks, numTrucks);
				break;
			case 3:
				ourFoodTruckApp.highestRating(trucks, numTrucks);
				break;
			case 4:
				System.out.println("You entered quit. Thank you for participating. Goodbye. ");
				break;
			default:
				System.out.println("That's not an option, Try again. ");
				break;
			}
		}
		scan.close();
	}

	public void Welcome() {
		System.out.println("Welcome to the Food Truck Food Court Review App!");
		System.out.println("Please input the name, food type and rating for up to 5 food trucks you visit today.");
	}

	public void MainMenu() {
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
	}

	public double calculateAverage(FoodTruck[] trucks, int numTrucks) {
		double average = 0;
		double sum = 0;
		for (int i = 0; i < numTrucks; i++) {
			sum += trucks[i].getNumericRating();
		}
		average = sum / numTrucks;
		System.out.println("The average is: " + average);
		return average;
	}

	public String listTrucks(FoodTruck[] trucks, int numTrucks) {
		String listNames = "";
		for (int i = 0; i < numTrucks; i++) {
			listNames += trucks[i].toString();
		}
		System.out.println(listNames);
		return listNames;
	}

	public void highestRating(FoodTruck[] trucks, int numTrucks) {
		FoodTruck highestFoodTruck = trucks[0];
		for (int i = 0; i < numTrucks; i++) {
			if (trucks[i].getNumericRating() > highestFoodTruck.getNumericRating()) {
				highestFoodTruck = trucks[i];
			}
		}
		System.out.println("The highest rated is: \n" + highestFoodTruck.toString());
	}
}
