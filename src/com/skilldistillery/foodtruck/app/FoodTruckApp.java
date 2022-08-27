package com.skilldistillery.foodtruck.app;
import java.util.*;
import com.skilldistillery.foodtruck.entities.*;
public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruckApp ourFoodTruckApp = new FoodTruckApp();
		//int numTrucks= 0;
		//FoodTruck[] trucks = new FoodTruck[numTrucks];
		
		ourFoodTruckApp.Welcome();
		
		Scanner scan = new Scanner(System.in);
		String userInName,userInType;
		int userInRating;
		// Need to iterate this loop up to five times with quit exit to while loop.
		int i = 0;
		System.out.println("How many trucks would you like to review? ");
		int numTrucks = scan.nextInt();
		while (numTrucks > 5) {
			System.out.println("That is not a valid number of trucks, try again.");
			System.out.println("How many trucks would you like to review? ");
			numTrucks = scan.nextInt();}
		FoodTruck[] truck = new FoodTruck[numTrucks];
		do {
		System.out.print("Name: ");
		userInName = scan.next();
		//if (userInName.equalsIgnoreCase("quit")) {
			//ourFoodTruckApp.MainMenu();
		//}
		System.out.println("Food Type: ");
		userInType = scan.next();
		System.out.println("Rating on scale 1 to 5 (Ate 1 and done, could easily eat 5-the best): ");
		userInRating = scan.nextInt();
		truck[i]= new FoodTruck(userInName,userInType,userInRating);
		i++;
		} while (i < numTrucks);
		
		
		System.out.println("Please select an option: ");
		
		//ourFoodTruckApp.calculateAverage(FoodTruck[] userInRating);
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
	System.out.println("4. Quit the program." );
}

public int calculateAverage(int[] userRating) {
	int average = 0;
	int sum = 0;
	average = sum/userRating.length;
	return average;
}
}

//public void Switch() {
//	switch (Menu) {
//	case 1:
//		// Pull all the names from FoodTruck[];
//	case 2:
//		ourFoodTruckApp.calculateAverage();
//	case 3:
//		//Run for highest rating
//	case 4:
//		//exit loop
//	}
//}



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

