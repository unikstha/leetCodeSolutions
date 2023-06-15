package parkingSystem;

import java.util.Scanner;

public class ParkingSystemMain {

	public static void main(String[] args) {
		int smallCarSpace = 0;
		int medCarSpace = 5;
		int largeCarSpace = 3;
		int parkAtSmallSpace = 1;
		int parkAtMedSpace = 2;
		int parkAtLargeSpace = 3;

		int solutionType;
		try {
			ParkingSystem parkingSystem = new ParkingSystem(smallCarSpace, medCarSpace, largeCarSpace);
			System.out.println("Total space for car available " + "\nFor small cars: " + smallCarSpace
					+ "\nFor medium cars: " + medCarSpace + "\nFor large cars: " + largeCarSpace);

			System.out.println("Choose Solution Type 1 or 2: " );
			Scanner userInput = new Scanner(System.in);
			solutionType = userInput.nextInt();

			userInput.close();
			if (solutionType <= 2 && solutionType > 0) {

				System.out.println("Processing user input...");
				if (solutionType == 1) {
					// Creating parking system with spots for 3 types of vehicle: small, medium, &
					// large.

					// Park small car
					boolean isParked = parkingSystem.addCar(parkAtSmallSpace);
					int availableSpace = parkingSystem.countSpace(parkAtSmallSpace);
					System.out.println("Car 1 (Small) parked: " + isParked);
					System.out.println("Space available: " + availableSpace);

					// Park medium car
					isParked = parkingSystem.addCar(parkAtMedSpace);
					System.out.println("Car 2 (Med) parked: " + isParked);
					availableSpace = parkingSystem.countSpace(parkAtMedSpace);
					System.out.println("Space available: " + availableSpace);

					// Park big car
					isParked = parkingSystem.addCar(parkAtLargeSpace);
					System.out.println("Car 3 (Large) parked: " + isParked);
					availableSpace = parkingSystem.countSpace(parkAtLargeSpace);
					System.out.println("Space available: " + availableSpace);
					
					// Park small car when no spot left
					isParked = parkingSystem.addCar(parkAtMedSpace);
					System.out.println("Car 4 (Med) parked: " + isParked);
					availableSpace = parkingSystem.countSpace(parkAtMedSpace);
					System.out.println("Space available: " + availableSpace);

					// Park invalid car type
					/*
					 * isParked = parkingSystem.addCar(4); System.out.println("Car 5 parked: " +
					 * isParked);
					 */} else {
					System.out.println("Solution 2 coming soon...");
				}
			} else {
				System.out.println("You must choose a solution type 1 or 2.");
			}
		} catch (Exception e) {
			System.out.println("Invalid input type. Use integers only." + e);
		}
	}
}
