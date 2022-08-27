package com.skilldistillery.foodtruck.app;
import java.util.*;
import com.skilldistillery.foodtruck.entities.*;
public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruckApp ourFoodTruckApp = new FoodTruckApp();
//		FoodTruck[] trucks;
		
		ourFoodTruckApp.Welcome();
		
		Scanner scan = new Scanner(System.in);
		String t1,t2;
		int t3;
		// Need to iterate this loop up to five times with quit exit to while loop.
		int i = 0;
		do {
		System.out.print("Name: ");
		t1 = scan.next();
		if (t1.equalsIgnoreCase("quit")) {
			ourFoodTruckApp.MainMenu();
		}
		System.out.println("Food Type: ");
		t2 = scan.next();
		System.out.println("Rating on scale 1 to 5 (Ate 1 and done, could easily eat 5-the best): ");
		t3 = scan.nextInt();
		FoodTruck trucks[i] = new FoodTruck(t1, t2, t3);
		i++;
		} while (i < 5);
		
		ourFoodTruckApp.MainMenu();

	}
public void Welcome() {
	System.out.println("Welcome to the Food Truck Food Court Review App!");
	System.out.println("Please input the name, food type and rating for up to 5 food trucks you visit today.");	
}


public void MainMenu() {
	System.out.println("Thank you for your input. What would you like to do next? " );
	System.out.println("1. List all existing food trucks." );
	System.out.println("2. See the average rating of food trucks." );
	System.out.println("3. Display the highest-rated food truck." );
	System.out.println("4. Quit the program." );}
}

//public void calculateAverage(int[] rating) {
//    double average = 0.0;
//    
//    // variable to hold the sum of all scores
//    double total = 0.0;
//    for (int i = 0; i < rating.length; i++) {
//      total += rating[i];
//    }
//    
//    average = sum / rating.length; // divide by the length because
//                                   // we don't know how long the passed-in
//                                   // array is (even though we're the ones passing it)
//    return average;
//  }

