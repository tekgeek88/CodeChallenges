

import java.util.Scanner;

public class CodeChallenge05 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		
		// the value of k at the end of the program
		double resultK;
		// initializing 
		resultK = 0; 
		// comment
		
		double sumK; // sum of all k outputs
		sumK = 0;
		
		// value of k^2
		double kSquared;
		
		// The variables for ( Ak^2-Bk+C ).
		double a,b,c;
		// comment
		// when the program hits this input number, it stops
		double d;

		/*
		 * Asks the user to input which numbers for the equation ( a*k^2 - b*k + c )
		 */
		boolean notZero;
		notZero = true;
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
		d = userInput.nextDouble();
		
		if (a < 0){
			
			while (d > 0){
				System.out.println("The negative 'a' make this program a negative curve.");
				System.out.println("Please try again.");
				System.out.println("At what number do you want the program to stop");
				d = userInput.nextDouble();
			}
		}
		else{
			
		}

		// closes scanner userInput
		userInput.close();
		

		for (double k = 1; k <= 20000; k++){
			
			if (a > 0){
				kSquared = Math.pow(k, 2);
				sumK = (kSquared*a - b*k + c) + sumK;

				if (sumK > d){
					resultK = k;
					break;
				}
			}
		
			else if (a < 0){
				
				kSquared = Math.pow(k, 2);
				sumK = (kSquared*a - b*k + c) + sumK;
				
				
				if (sumK < d){
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
		System.out.println("It stopped at = " + d);
		System.out.println();
		System.out.print("The final value of k = ");
		System.out.println(resultK);
		System.out.print("The final sum value  = ");
		System.out.println(sumK);
		
	}
	
	// I just added this line

} // end of class 
