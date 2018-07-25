
//		WEEK 4 ASSIGNMENT 4 - 2D ARRAYS
//		4.	MOVEMENT ON A 2D PLANE
//			Create a 2D character array with 5 rows and 5 columns
//			To start, fill every position with an O.
//			Then, fill the [0][0] position with an X.
//			This X represents the user's "avatar".
//
//			Create a loop which does the following:
//			-Starts by printing the array
//			-Asks the user for what direction they would like to go
//			-Waits for user input
//			-Moves the avatar in that direction, if it exists (ie: up=row-1, right=column+1)
//			-If it does not exist, tell the user and exit the program
//			-Fill the avatar's new position with an X
//			-Fill the avatar's old position with an O
//
//			Example Output:
//			Current Map:
//			=========
//			X O O O O
//			O O O O O
//			O O O O O
//			O O O O O
//			O O O O O
//			=========
//			Which direction would you like to move?
//			>down
//	
//			Current Map:
//			=========
//			O X O O O
//			O O O O O
//			O O O O O
//			O O O O O
//			O O O O O
//			=========
//			Which direction would you like to move?
//			>up
//	
//			Error: You cannot move there from your current position
//			Exiting program...
		
		
//		---------------------------------------------------------------------------------------------------
		
	
package week4_A4_2D_ARRAYS;

import java.util.Scanner;

public class Assignment4_4 {

	public static void main(String[] args) {
	
//	CREATE ARRAY (CONVERSION TO CHAR WILL BE DONE LATER IN THE CODE)
		String[][] arr1 = {
				{ "O", "O", "O", "O", "O"},
				{ "O", "O", "O", "O", "O"},
				{ "O", "O", "O", "O", "O"},
				{ "O", "O", "O", "O", "O"},
				{ "O", "O", "O", "O", "O"}
				};
//	MISC VARIABLES WE WILL USE
		int flag = 1;	/*COUNTER WE USE TO EXIT OUT OF WHILE LOOP*/
		int rc = 0; 	/*ROW COORDINATE*/
		int cc = 0; 	/*COLUMN COORDINATE*/
		
//	INSERT PLAYER'S LOCATION (X) AT [0][0]
		arr1[rc][cc] = "X";
		
//	OPENS SCANNER
		Scanner reader = new Scanner(System.in);
		System.out.println("Hello, Your location is \"X\", at the top left corner of the map!");
		System.out.println("You can type \"Up\", \"Down\", \"Left\", and \"Right\", to move around.");
		System.out.println("If you decide to leave the map, I will exit the program.");		
		
//	START OF THE WHILE LOOP
		while (flag == 1) {
			
//	PRINT ARRAY FOR THE USER TO SEE WITH THEIR LOCATION
			System.out.println();
			for (int row = 0; row < arr1.length; row++) {
				for (int col = 0; col < arr1[row].length; col++) {	
					
//	THIS WILL SPACE OUT THE ELEMENTS FOR BETTER VIEWABILITY
					System.out.print(arr1[row][col] + " ");
				}
				
//	THIS WILL LINE BREAK WHEN ROW FINISHES
				System.out.println();
			}
			
//	USER INSTRUCTIONS, AND FETCH VALUE FOR LOCATION
		System.out.println();
		System.out.println("Where would you like to go?");
		String move = reader.nextLine();
		
//	CONVERT USER'S STRING VALUE INTO LOWERCASE
		move = move.toLowerCase();
		
//	CASE STATEMENT USED TO EXECUTE PROPER MOVEMENT OF NEW COORDINATES
//	FIRST WE REMOVE USER'S LAST MARKER, APPLY NEW VALUE FOR THE COORDINATES
//	CHECK IF THAT NEW VALUE DOES NOT LEAVE THE MAP IF SO WE BREAK OUT OF THE PROGRAM
//	IF VALUE IS VALID THEN WE INSERT NEW VALUES TO THE MAP
		
			switch (move) {
				case "up" :    arr1[rc][cc] = "O";
							   rc = rc - 1;
							   if (rc < 0) {
								   System.out.println();
								   System.out.println("You have left the map, GOOD BYE!");
						 		   flag = 0;
						 		   reader.close();	
						 		   break;
							   } else {
							   arr1[rc][cc] = "X";
							   break;
							   }
							   
				case "down" :  arr1[rc][cc] = "O";
							   rc = rc + 1;
							   if (rc > 4) {
								   System.out.println();
								   System.out.println("You have left the map, GOOD BYE!");
						 		   flag = 0;
						 		   reader.close();	
						 		   break;
							   } else {
							   arr1[rc][cc] = "X";
							   break;
							   }
							   
				case "left" :  arr1[rc][cc] = "O";
				  			   cc = cc - 1; 
				  			   if (cc < 0) {
				  				   System.out.println();
								   System.out.println("You have left the map, GOOD BYE!");
						 		   flag = 0;
						 		   reader.close();	
						 		   break;
							   } else {
							   arr1[rc][cc] = "X";
							   break;
							   }
				  			   
				case "right" : arr1[rc][cc] = "O";
	  			               cc = cc + 1;
	  			               if (cc > 4) {
	  			            	   System.out.println();
								   System.out.println("You have left the map, GOOD BYE!");
						 		   flag = 0;
						 		   reader.close();	
						 		   break;
							   } else {
							   arr1[rc][cc] = "X";
							   break;
							   }
//	INVALID DIRECTION WILL EXIT THE PROGRAM 			               
	  			default :      System.out.println();
	  						   System.out.println("You did not enter a valid direction, check your spelling.");
	  			  			   System.out.println("Check your spelling...GOOD BYE!");
	  			  			   flag = 0;
	  			  			   reader.close();	
	  			  			   break;
			}		
		}
	}
}
