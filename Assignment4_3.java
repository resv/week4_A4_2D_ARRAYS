//		WEEK 4 ASSIGNMENT 4 - 2D ARRAYS
//		3.	TIC TAC TOE
//			Create a 2D character array with 3 rows and 3 columns.
//			Start by filling the array with spaces.
//			Create a loop that will do the following:
//			Ask the user for what row and column they would like to place their mark.
//			If the spot is currently filled with a space, place their mark.
//			If it's currently an odd-numbered turn, the mark is X
//			If it's currently an even-numbered turn, the mark is Y
//			At the end of their turn, print the current board
//			Continue until all spaces are filled.
		
		
//		---------------------------------------------------------------------------------------------------
	

package week4_A4_2D_ARRAYS;

import java.util.Scanner;

public class Assignment4_3 {

	public static void main(String[] args) {
	
// 		NOTE:	REQUIREMENT DID NOT REQUEST FOR PROGRAM TO STOP IF A WIN
//				CONDITION IS FOUND BUT RATHER UNTIL ALL CONDITIONS ARE FILLED
//				THERE FOR I DID NOT INSTRUCT PROGRAM TO STOP IF A PLAYER WINS
//				BEFORE ALL SPACES ARE FILLED
		
//		CREATING AN 3X3 ARRAY WITH BLANK SPACE ELEMENTS
			String[][] arr1 = {
					{ " ", " ", " "},
					{ " ", " ", " "},
					{ " ", " ", " "}
					};
		
//		CREATING GAME OVER COUNTER, TURN COUNTER // (X) ODD 1 = PLAYER 1, (Y) EVEN 2 = PLAYER 2
			int counter = 1;
			int turn = 1;
		
//		OPENS SCANNER
				Scanner reader = new Scanner(System.in);
				
//		WELCOME MSG AND INSTRUCTIONS FOR USER	
				System.out.println("Hello, welcome to TicTacToe!");
			
//		CODE TO PRINT OUT TICTACTOE BOARD WITH LINES
			for (int row = 0; row < arr1.length; row++) {
				for (int col = 0; col < arr1[row].length; col++) {
					if (col == 0 || col == 1) {
						System.out.print(arr1[row][col]+ "|");
					} 
						if (col == 2) {
							System.out.print(arr1[row][col]);
							System.out.println();
						}
				}
			}
			
//		WELCOME MESSAGE & INSTRUCTIONS FOR USER
			System.out.println("Tell me which ROW and then COLUMN you want to place your marker!");
			
//		GAME COUNTER, WILL EXIT IF NO MOVES ARE LEFT
			while (counter != 10) {

//------PLAYER 1'S TURN BEGINS -----------------------------------------------------------------------
			if (turn == 1 && counter != 10) {
				System.out.println("PLAYER 1, what ROW do you want to place your X?  ");
				Integer xrow = reader.nextInt();
				System.out.println("PLAYER 1, what COLUMN do you want to place your X?");
				Integer xcol = reader.nextInt();
//		CONVERTING PLAYER1'S SELECTION TO WORK WITHIN ARRAY BOUNDS	
			xrow = xrow - 1;
			xcol = xcol -1;
//		VERIFYING IF PLAYERS VALUES ARE WITHIN BOUNDS OF THE BOARD	
			if ((xrow < 0 || xrow > 2) || (xcol < 0 || xcol > 2)) {
				System.out.println("You entered a row / col range OUT OF BOUNDS of the board, TRY AGAIN!!!");
				continue;
			}
//		INSERTING X INTO BOARD
			if ((xrow >= 0 && xrow <= 2) || (xcol >= 0 && xcol <= 2)) {
				if (arr1[xrow][xcol] == " ") {
					arr1[xrow][xcol] = "X";
//		PRINT CURRENT TICTACTOE BOARD WITH LINES
					for (int row = 0; row < arr1.length; row++) {
						for (int col = 0; col < arr1[row].length; col++) {
							if (col == 0 || col == 1) {
								System.out.print(arr1[row][col]+ "|");
							}
								if (col == 2) {
									System.out.print(arr1[row][col]);
									System.out.println();
								}
						}
					}
			turn = 2;
			counter++;
//		WILL INSTRUCT USER THAT THE POSITION REQUESTED IS ALREADY FILLED AND TRY AGAIN
			} else {
				System.out.println("Sorry that spot is already vacant!");
				System.out.println("Try again!");
				continue;
			}
			}
//------PLAYER 1'S TURN ENDS   -----------------------------------------------------------------------
			
			
			
//------PLAYER 2'S TURN BEGINS -----------------------------------------------------------------------
			if (turn == 2 && counter != 10) {
			System.out.println("PLAYER 2, what ROW do you want to place your X?  ");
			Integer yrow = reader.nextInt();
			System.out.println("PLAYER 2, what COLUMN do you want to place your X?");
			Integer ycol = reader.nextInt();
//		CONVERTING PLAYER2'S SELECTION TO WORK WITHIN ARRAY BOUNDS	
			yrow = yrow - 1;
			ycol = ycol -1;
//		VERIFYING IF PLAYERS VALUES ARE WITHIN BOUNDS OF THE BOARD	
			if ((yrow < 0 || yrow > 2) || (ycol < 0 || ycol > 2)) {
				System.out.println("You entered a row / col range OUT OF BOUNDS of the board, TRY AGAIN!!!");
				continue;
			}
//		INSERTING Y INTO BOARD
			if (arr1[yrow][ycol] == " ") {
			arr1[yrow][ycol] = "Y";
//		CODE TO PRINT OUT TICTACTOE BOARD WITH LINES
				for (int row = 0; row < arr1.length; row++) {
					for (int col = 0; col < arr1[row].length; col++) {
						if (col == 0 || col == 1) {
							System.out.print(arr1[row][col]+ "|");
						}
							if (col == 2) {
								System.out.print(arr1[row][col]);
								System.out.println();
							}
					}
				}
			turn = 1;
			counter++;
//		WILL INSTRUCT USER THAT THE POSITION REQUESTED IS ALREADY FILLED AND TRY AGAIN
			} else {
				System.out.println("Sorry that spot is already vacant!");
				System.out.println("Try again!");
				continue;
			}
			}
//------PLAYER 2'S TURN ENDS   -----------------------------------------------------------------------	
			}
		}
//------GAME OVER SWITCH ----------------------------------------------------------------------------
			if (counter == 10) {
				System.out.println();
				System.out.println("GAME OVER!");
//		CLOSES SCANNER	
				reader.close();
			}
	}
}
