// This file is used to find the limit of a specified value.

import java.text.DecimalFormat; // allows for custom format of numbers

/**
 * A simple program to calculate all possible values for K
 * within a maximum range of a trinomial function that is
 * input by the user.
 *
 * @author Amy Irving
 * @author Garret Engle
 * @author Carl Argabright
 * @author Tyler Fleckenstein
 * 
 */
public class Cs142Hw5ArgabrightCarl {

	public static void main(String[] args) {
		
		double inputA,inputB,inputC; 	// The variables used in the formula Ak^2-Bk+C
		double inputK= 0;				// The input for the function f(k)=10k^2 - 4k + 2
		double kSquared= 0;				// Since kSquared is not a literal and is the result of an expression
		double functionOfK = 0;			// The final result of each function
		double sumOfAllFunctions = 0;
		double endPoint;				// The point that the program stops adding solutions of the function
		DecimalFormat df = new DecimalFormat("#,###,###,###,###,###.##");  // Makes the result easy on the eyes
		
		// Displays splash screen
		System.out.println("\n                 .................................................");
		System.out.println("              -=:8888888888888888888888888888888888888888888888888:=-");
		System.out.println("                88                                               88");
		System.out.println("                88           Evaluate an Expression App" + "\u2122         88");
		System.out.println("                88                       By:                     88");
		System.out.println("                88                   Amy Irving                  88");
		System.out.println("                88                  Garret Engle                 88");
		System.out.println("                88                Carl Argabright                88");
		System.out.println("                88               Tyler Fleckenstein              88");
		System.out.println("                88                                               88");
		System.out.println("                88   The intent of this program is to find out   88");
		System.out.println("                88   how many times an expression must be eva-   88");
		System.out.println("                88   luated by incrementing the variable k by    88");
		System.out.println("                88   one and ending when the result reaches t-   88");
		System.out.println("                88   he desired output number which is select-   88");
		System.out.println("                88   ed by the user.                             88");
		System.out.println("                88                                               88");
		System.out.println("                88               Version 1.0.1_beta              88");
		System.out.println("                88                                               88");
		System.out.println("              -=:8888888888888888888888888888888888888888888888888:=-");
		System.out.println("                 \'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'"
											+ "\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\n");
		System.out.println("         For example: 10k^2 - 4k + 2 reaches 20,444 when k is incremented 18x\n");
		
		//Gather the values of the terms from the users
		System.out.print("Enter a number for A: ");
		inputA = TextIO.getDouble();
		if (inputA < 0){
				System.out.println("\n ** Warning ** The negative 'A' makes this function have a negative curve.\n");
				System.out.println("hint: A negative stopping point will be required\n");
			} //end of if statement
		while (inputA == 0){ //Tests to make sure both A and B are not equal zero
			System.out.println("Sorry, both A and B cannot equal zero");
			System.out.print("Please try again: \n");
			System.out.print("What is the value of A:");
			inputA = TextIO.getDouble();
		} // end of test for A and B
		System.out.print("Enter a number for B: ");
		inputB = TextIO.getDouble();
		while (inputB == 0){ //Tests to make sure both A and B are not equal zero
			System.out.println("Sorry, A and B cannot equal zero");
			System.out.print("Please try again: \n");
			System.out.print("What is the value of A:");
			inputB = TextIO.getDouble();
		} // end of test for A and B
		System.out.print("Enter a number for C: ");
		inputC = TextIO.getDouble();
		System.out.print("\nEnter number you would like the results of your function to sum to: ");
		endPoint = TextIO.getDouble();
		if (inputA < 0){
			while (endPoint > 0){
				System.out.println("\nThe negative 'A' makes this program have negative curve.\n");
				System.out.println("Please re-enter a negative value!");
				System.out.print("At what negative number do you want the program to stop: ");
				endPoint = TextIO.getDouble();
			} //end of while loop
		} // end of if
		
		// Confirm the variables that the user chose
		System.out.println("\nYou entered:\n"
				+ "              A = " + inputA + "\n              B = " + inputB
				+ "\n              C = " + inputC);
		
		/* The purpose of these two if statements is to change the less than and equal than sign
		 * to compensate for the endPoint when given a negative leading coefficient which makes the parabola up
		 * instead of down.
		 */
		
		if (inputA > 0){
			while (sumOfAllFunctions < endPoint){
				//The solution for each variable
				kSquared = Math.pow(inputK,2);		// solve for k^2
				double aTerm = (inputA*kSquared);	//Solve for the A term
				double bTerm = (inputB*inputK);		//Solve for the B term
				double cTerm = (inputC);			//Solve for the C term	
				functionOfK = (aTerm+bTerm+cTerm); //result of the function
				sumOfAllFunctions = (functionOfK + sumOfAllFunctions);  // adds the results of each function

				/* To check the result of each individual function uncomment these two lines
				 * 
				 * System.out.println("The result when k = " + inputK +" is: " + functionOfK);
				 * System.out.println("The sum of all functions is " + sumOfAllFunctions);
				 * 
				 */
				
				inputK++;
			} // end of while loop
		} // end of if statement
		
		if (inputA < 0){
			while (sumOfAllFunctions > endPoint){
				//The solution for each variable
				kSquared = Math.pow(inputK,2);		// solve for k^2
				double aTerm = (inputA*kSquared);	//Solve for the A term
				double bTerm = (inputB*inputK);		//Solve for the B term
				double cTerm = (inputC);			//Solve for the C term	
				functionOfK = (aTerm+bTerm+cTerm); //result of the function
				sumOfAllFunctions = (functionOfK + sumOfAllFunctions);  // adds the results of each function
				inputK++;
				
				/* To check the result of each individual function uncomment these two lines
				 * 
				 * System.out.println("The result when k = " + inputK +" is: " + functionOfK);
				 * System.out.println("The sum of all functions is " + sumOfAllFunctions);
				 */
				
			} // end of while loop
		} // end of if statement
		inputK--; // correct the count for the last count of the if statement
		System.out.println("\n\nThe current value of K is " + inputK + " and the sum of all functions is " + df.format(sumOfAllFunctions) + "\n\n");
		System.out.println("Your equations last increment added was: "+ functionOfK);
		
	} // end of main() method
	
} //end of class
