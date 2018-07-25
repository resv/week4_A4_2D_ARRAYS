//		WEEK 4 ASSIGNMENT 4 - 2D ARRAYS
//		1.	MAX VALUE
//			Create a 2D integer array with 3 rows and 3 columns.
//			Fill the array with data.
//			Print out the maximum value in the array.
		
		
//		---------------------------------------------------------------------------------------------------
		
		
package week4_A4_2D_ARRAYS;

public class Assignment4_1 {

	public static void main(String[] args) {

//		CREATING AN 3X3 ARRAY METHOD 1 (NO ELEMENTS)
//			int[][] arr1 = new int[3][3];
		
//		CREATING AN 3X3 ARRAY METHOD 2 WITH ELEMENTS
			int[][] arr1 = {
					{ 10, 20, 30},
					{ 40, 50, 60},
					{ 70, 80, 90}
					};
			
//		INSTANCIATING VARIABLE // BR = LINE BREAK COUNTER
			int highest = 0;
			
//		ITERATING THROUGH EACH ROW FIRST THEN COLUMN USING "FOR LOOP" TO SEARCH FOR HIGHEST VALUE
			for (int row = 0; row < arr1.length; row++) {
				for (int col = 0; col < arr1[row].length; col++) {
					if (highest < arr1[row][col]) {
						highest = arr1[row][col];
						System.out.print(arr1[row][col]+ "  ");
						
//						WE LINE BREAK ONCE WE REACH COLUMN 3
							if (col == 2) {
								System.out.println();
							}
					}
				}
			}
			System.out.println();
			System.out.println("The highest value of this 2D array is " + highest);	
	}
}
