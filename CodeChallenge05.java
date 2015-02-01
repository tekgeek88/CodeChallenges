/* A program that calculates the maximum sum of all solutions of a trinomial
 * by allowing the user to input their own variables for each term Ak+Bk+C
 * 
 */

import java.util.Scanner;

public class CodeChallenge05 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		
		// Initialize the variables to be used in the program
		double a,b,c; 		// The variables used in the formula Ak^2-Bk+C
		double kSquared; 	// The value of k squared
		double sumK = 0; 	// The sum of all k outputs
		double count; 		// The number of times a new number was plugged in for k
		double resultK = 0; // The value of k at the end of the program.
		boolean notZero = true;	// Prevents zero from being used as the A and/or B terms of the formula
		
		// Asks the user to input numbers used in the form of Ak^2-Bk+C
		System.out.println("\n\nWelcome,");
		System.out.println("this program lets you create you own equations and find out when "
				+ "the sum of that equation reachs a specified number.");
		System.out.println("The formula is 'ak^2 + bk + c'");
		
		System.out.println("What is the value of A");
		a = userInput.nextDouble();
	
		//Tests to make sure both A and b do not equal zero
		while (notZero){
			if(a == 0 ){
				System.out.println("Sorry, both A and B cannot equal zero");
				System.out.println("Please try again:");
				
				System.out.println();
				System.out.println("What is the value of A:");
				a = userInput.nextDouble();
				
			}
			
			else{
				break;
			}
		}
	
		
		
		System.out.println("What is the value of B");
		b = userInput.nextDouble();
		
		System.out.println("what is the value of C");
		c = userInput.nextDouble();
		
		System.out.println("At what number do you want the program to stop");
		count = userInput.nextDouble();
		
		if (a < 0){
			
			while (count > 0){
				System.out.println("The negative 'a' make this program a negative curve.");
				System.out.println("Please try again.");
				System.out.println("At what number do you want the program to stop");
				count = userInput.nextDouble();
			}
		}
		else{
			
		}

		// closes scanner userInput
		userInput.close();
		

		for (double k = 1; k <= 20000; k++){
			
			if (a > 0){
				kSquared = Math.pow(k, 2);
				sumK = ((kSquared*a) - (b*k) + c) + sumK;

				if (sumK > count){
					resultK = k;
					break;
				}
			}
		
			else if (a < 0){
				
				kSquared = Math.pow(k, 2);
				sumK = (kSquared*a - b*k + c) + sumK;
				
				
				if (sumK < count){
					resultK = k;
					break;
				}
			}
			

		}
		
		
		/*
		 * Prints out all the final values
		 */
		
		System.out.println();
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		System.out.println("It stopped at = " + count);
		System.out.println();
		System.out.print("The final value of k = ");
		System.out.println(resultK);
		System.out.print("The final sum value  = ");
		System.out.println(sumK);
		
	}
	
	// I just added this line

} // end of class 
