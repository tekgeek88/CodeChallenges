/* A program that calculates the maximum sum of all solutions of a trinomial
 * by allowing the user to input their own variables for each term Ak+Bk+C
 * 
 */

public class CodeChallenge05broken {

	public static void main(String[] args) {
		
		// Initialize the variables to be used in the program
		double a,b,c; 		// The variables used in the formula Ak^2-Bk+C
		double kSquared; 	// The value of k squared
		double sumK = 0; 	// The sum of all k outputs
		double count; 		// The number of times a new number was plugged in for k
		double resultK = 0; // The value of k at the end of the program.
		
		//Runs the splash screen


System.out.println("\n         .................................................");
System.out.println("      -=:8888888888888888888888888888888888888888888888888:=-");
System.out.println("        88                                               88");
System.out.println("        88           Evaluate an Expression App          88");
System.out.println("        88                       By:                     88");
System.out.println("        88                   Amy Irving                  88");
System.out.println("        88                  Garret Engle                 88");
System.out.println("        88                Carl Argabright                88");
System.out.println("        88               Tyler Fleckenstein              88");
System.out.println("        88                                               88");
System.out.println("        88   The intent of this program is to find out   88");
System.out.println("        88   how many times an expression must be eva-   88");
System.out.println("        88   luated by incrementing the variable k by    88");
System.out.println("        88   one and ending when the result reaches t-   88");
System.out.println("        88   he desired output number which is select-   88");
System.out.println("        88   by the user.                                88");
System.out.println("        88                                               88");
System.out.println("        88               Version 1.0.1_beta              88");
System.out.println("        88                                               88");
System.out.println("      -=:8888888888888888888888888888888888888888888888888:=-");
System.out.println("         \'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'"
							+ "\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\'\n");
System.out.println("         For example: 10k^2 - 4k + 2 reaches as close as");
System.out.println("         as it can get to 20,000 in \n\n");

		
		
		// Asks the user to input numbers used in the form of Ak^2-Bk+C
		System.out.println("               The formula is 'Ak^2 + Bk + C'");
		System.out.print("\nEnter the value for A: ");
		a = TextIO.getDouble();
		while (a == 0){ //Tests to make sure both A and B are not equal zero
			System.out.println("Sorry, both A and B cannot equal zero");
			System.out.print("Please try again: \n");
			System.out.print("What is the value of A:");
			a = TextIO.getDouble();
		}//end of A & B == 0 while loop
		System.out.print("Enter the value for B: ");
		b = TextIO.getDouble();
		System.out.print("Enter the value for C: ");
		c = TextIO.getDouble();
		System.out.print("\nAt what number do you want the program to stop");
		count = TextIO.getDouble();
		
		if (a < 0){
			while (count > 0){
				System.out.println("The negative 'a' make this program a negative curve.");
				System.out.println("Please try again.");
				System.out.println("At what number do you want the program to stop");
				count = TextIO.getDouble();
			} //end of while loop
			
		}

		for (double k = 1; k <= 20000; k++){
			
			if (a > 0){
				kSquared = Math.pow(k, 2);
				sumK = ((((kSquared*a) - (b*k)) + c) + sumK);

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
