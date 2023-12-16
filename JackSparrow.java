package com.mantra.test;

import java.util.Scanner;

/**
 * Captain Jack Sparrow decided to go sailing with a crew. The crew consists of
 * n people, including the captain. The crew is divided into groups based on
 * their weight: A members with weight 1 unit, B members with weight 2 units, C
 * members with weight 3 units, and D members with weight 4 units, such that A +
 * B + C + D = n.
 *
 * The captain needs to determine the minimum number of rescue boats required
 * for the crew. Each rescue boat has a maximum weight capacity of 4 units. Now
 * captain wants to know minimum number of boats they should carry with them.
 * Help captain!
 * 
 * Input Format Four space separated integers A, B, C and D.
 * 
 * Constraints
 * 
 * 0 < A,B,C,D < 1000000
 * 
 * Output Format
 * 
 * Print a number(minimum number of boats).
 * 
 * Sample Input 0
 * 
 * 1 1 2 1 Sample Output 0
 * 
 * 4 Sample Input 1
 * 
 * 2 2 2 2 Sample Output 1
 * 
 * 5
 */
public class JackSparrow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the group A member count...");
		int A = scanner.nextInt();
		System.out.println("Enter the group B member count...");
		int B = scanner.nextInt();
		System.out.println("Enter the group C member count...");
		int C = scanner.nextInt();
		System.out.println("Enter the group D member count...");
		int D = scanner.nextInt();

		int minimumBoats = calculateMinimumBoats(A, B, C, D);
		System.out.println("Minimum Boat required for captain is: " + minimumBoats);

		scanner.close();

	}

	private static int calculateMinimumBoats(int A, int B, int C, int D) {
		// TODO Auto-generated method stub
		// total weight for each category of crew members
		int totalWeightA = A * 1;
		int totalWeightB = B * 2;
		int totalWeightC = C * 3;
		int totalWeightD = D * 4;

		// total weight of the crew
		int totalWeight = totalWeightA + totalWeightB + totalWeightC + totalWeightD;
		System.out.println("Total Weight on the ship: " + totalWeight);

		// Divide the total weight by 4 and round it up to get the minimum boats needed
		// Adding 3 to totalWeightA ensures that even if there's a fractional part after
		// dividing totalWeight by 4
		int minimumBoats = (totalWeight + 3) / 4;

		return minimumBoats;
	}

}
