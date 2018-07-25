//		WEEK 4 ASSIGNMENT 4 - 2D ARRAYS
//		2.	SUM OF A COLUMN
//			Create a 2D integer array with 3 rows and 3 columns.
//			Fill the array with random data.
//			Ask the user which column they would like to get the sum of.
//			Get the total of all values in that column.
//			For instance, if the user chose column 1:
//			array[0][1] + array[1][1] + array[2][1]
		
		
		
//		---------------------------------------------------------------------------------------------------
		
	
package week4_A4_2D_ARRAYS;

import java.util.Scanner;

public class Assignment4_2 {

	public static void main(String[] args) {
	
//		CREATING AN 3X3 ARRAY WITH RANDOM ELEMENTS
			int[][] arr1 = {
					{ 100, 200, 300},
					{ 100, 200, 300},
					{ 100, 200, 300}
					};
			
//		DISPLAYING THE COLUMN TO THE USER, WITH A LITTLE BIT OF SPACING FOR BETTER VIEWABILITY
//		ITERATING THROUGH EACH ROW FIRST THEN COLUMN USING "FOR LOOP" TO SEARCH FOR HIGHEST VALUE
			for (int row = 0; row < arr1.length; row++) {
				for (int col = 0; col < arr1[row].length; col++) {
						System.out.print(arr1[row][col]+ "  ");
//					WE LINE BREAK ONCE WE REACH COLUMN 3
						if (col == 2) {
							System.out.println();
						}
				}
			}
			System.out.println();
			
//		OPENS SCANNER AND INSTANCIATE VARIABLE FOR TOTAL
			Scanner reader = new Scanner(System.in);
			int total;
			
//		INSTRUCTIONS FOR USER AND FETCH ELEMENTS TO ADD FROM ARRAY INDEXES
			System.out.println("Hello, I can add the total values you see in each COLUMN!");
			System.out.println();
			System.out.println("Which column would you like me to add: 1, 2 , or 3?");
			Integer choice = reader.nextInt();
			
//		USING A CASE STATEMENT TO CHOOSE WHICH COLUMNS TO ADD
			switch (choice) {
			case 1 : {
				total = arr1[0][0] + arr1[1][0] + arr1[2][0];
				System.out.println();
				System.out.println(total + " is the sum of all values in column 1!");
				break;
				}
			case 2 : {
				total = arr1[0][1] + arr1[1][1] + arr1[2][1];
				System.out.println();
				System.out.println(total + " is the sum of all values in column 2!");
				break;
				}
			case 3 : {
				total = arr1[0][2] + arr1[1][2] + arr1[2][2];
				System.out.println();
				System.out.println(total + " is the sum of all values in column 3!");
				break;
				}
			}		
			
//		CLOSES SCANNER	
			reader.close();		
	}

}
