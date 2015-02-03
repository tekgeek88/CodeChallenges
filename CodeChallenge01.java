/********************************************	
 * 	A simple command line calculator		
 * 	that asks a user for their name			
 * 	and gathers information in order		
 * 	to solve exponential functions. 		
 * 											
 *	@author  Carl Argabright				
 * 	@version 0.0.1							
 * 	@since   2015-01-16 					
 * 											
 ********************************************/

public class CodeChallenge01 {

	public static void main(String[] args){		//Beginning of Main() method
		
		/************************************	
		* 	Variable declaration statements
		* 	@
		************************************/
			double inputX;  	// The variable used as the base
			double inputY;		// The variable as exponent
			String inputName = "Name";	// The variable used to store users name
			boolean playAgain;		// The variable that allows program to repeat.
			int inputPlayAgain;	// boolean for the while loop
			
			//Set initial value for loop statement
			playAgain = true;
			
			// Prints graphical logo and directions to standard output
			while (playAgain = true) {
				System.out.println("playAgain value is " + playAgain);
				System.out.println("\n\n\n		.==========================================================.");
				System.out.println("		*                                                           *");
				System.out.println("		*         MathIsFun™: Solving Exponential Equations         *");
				System.out.println("		*                   By: Carl Argabright                     *");
				System.out.println("		*                                                           *");
				System.out.println("		*                   CS 142 - Dr. Basham                     *");
				System.out.println("		'~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~'\n");
				System.out.println("	                 	     **  Directions  **\n");
				System.out.println("		Step 1:	Select a base.");
				System.out.println("		Step 2: Select an exponenent to multiply against the base.");
				System.out.println("		Step 3: Exponential problem solved.\n");
				System.out.println("		  ._____________________________________________________.");
				System.out.println("		  |                                                     |");
				System.out.println("		  |   ** Tip: Base can be whole number or a decimal **  |");
				System.out.println("		  '—————————————————————————————————————————————————————'");
				System.out.println("");
				System.out.println("    ==================================================================================\n\n");
				
				// Get input from user
				System.out.print("Enter your name: ");
				inputName = TextIO.getlnString();
				System.out.println("\nPleased to meet you " + inputName + "!, your name has been stored...\n");
				System.out.print("Enter a number for the base: ");
				inputX = TextIO.getlnDouble();
				System.out.print("Enter a number for the exponent: ");
				inputY = TextIO.getlnDouble();
	
				
				
				/* Result prints with as many decimals as needed
				 * to allow users to compute square roots by taking
				 * an value to the half power therefore type
				 * double was used without printf.
				 */
				// Print the result to the standard window.
				System.out.print("\n" + inputX + " Raised to the power of " + inputY + " is ");
				System.out.println(Math.pow(inputX,inputY)+"\n");
				System.out.println("Your calculation has been computed successfully!\n");
				
				// Decide whether to restart the program
				System.out.println("Would you like to make another calculation?\n");
				System.out.print("\"0\" = yes, 1 = \"NO\"...  Enter your choice: ");
				inputPlayAgain = TextIO.getInt();
				if (playAgain == true){
					playAgain = false;
					System.out.println("If statement as run");
					//System.out.println("Playagain value is " + playAgain);
				} // End of if
				else if (inputPlayAgain == 1){
					playAgain = false;
					System.out.println("else if statement has run");
					System.out.println("Playagain value is " + playAgain);
				} //End of else if
				

			}// end of loop if user inputs "1"
			System.exit(0);
			// Thanks user and exits program
			System.out.println("\nThank you for using our software " + inputName + "\n");
			
			
	}	// End of Main() method


}// End of MathIsFun class