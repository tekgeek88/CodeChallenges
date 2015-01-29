

import java.util.Scanner;

public class CodingChallenge05 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		
		// the value of k at the end of the program
		double z;
		// initializing 
		z = 0; 
		
		// sum of all k outputs
		double sk;
		//initializing
		sk = 0;
		
		// value of k^2
		double v;
		
		// the first input number in the equations ( a*k^2 - b*k + c ).
		double a;
		
		// the second input number in the equations ( a*k^2 - b*k + c ).
		double b;
		
		// the third input number in the equations ( a*k^2 - b*k + c ).
		double c;
		
		// when the program hits this input number, it stops
		double d;

		
		boolean notZero;
		notZero = true;
		 

		/*
		 * Asks the user to input which numbers for the equation ( a*k^2 - b*k + c )
		 */
		
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
				v = Math.pow(k, 2);
				sk = (v*a - b*k + c) + sk;

				if (sk > d){
					z = k;
					break;
				}
			}
		
			else if (a < 0){
				
				v = Math.pow(k, 2);
				sk = (v*a - b*k + c) + sk;
				
				
				if (sk < d){
					z = k;
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
		System.out.println(z);
		System.out.print("The final sum value  = ");
		System.out.println(sk);
		
	}

} // end of class 
