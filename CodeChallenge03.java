/* A program to test whether the IDE is
 * able to determine whether a variable
 * has been given a value.
 */


public class CodeChallenge03 {
	
	public static void main(String[] args) {
		
		//Left side
			
			//Declare the variables
			int inputX;
			int leftY;
			
			// Ask user to set the value of left X
			System.out.print("\n\nEnter a number for for the left \"X\": ");
			inputX = TextIO.getInt();
			
			// run some conditional statements to set the value of leftY
			if (inputX < 0) {
				leftY = 1;
			}
			else {
				leftY = 2;
			}
			
		//Right side
			
			//Declare the variables for the right side
			int rightY;
			
			// run some conditional statements to change the value of rightY
			if (inputX < 0) {
				rightY = 1;
			} // end if
			
			else {
				rightY = 2;
			} // end else
			
			// Print the results to the standard output
			System.out.println("\nWhen inputX is " + inputX + ":\n");
			System.out.println("          The value of the leftY is:  " + leftY);
			System.out.println("          and The value of rightY is: " + rightY);
			
	} //  end main method

} // end of CodeChallenge03 class
