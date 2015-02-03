/* A program that converts Cartesian coordinates
 * into polar coordinates
 */

public class CodeChallenge04 { // git update
	
	public static void main(String[] args) {
		
		//Declare the variables
		double inputX;
		double inputY;
		double radius;
		double theta;

	
		//Gather the Cartesian coordinates from the user
		System.out.println("Please enter the Cartesian coordinates...\n");
		System.out.print("Enter the \"X\" coordinate: ");
		inputX = TextIO.getDouble();
		System.out.print("Enter the \"Y\" coordinate: ");
		inputY = TextIO.getDouble();
		System.out.println("\nThe coordinates you intered are (" + inputX + "," + inputY + ")");  // verify the result entered
	
	
		//Solve for the hypoteneuse
		radius = Math.hypot(inputX, inputY);
		System.out.println("The radius is: " + radius + "\n");
		
						//Compute theta using atan2
						//theta = Math.atan2(inputX, inputY);
						//System.out.println("The angle in radians is: " + theta );
						//System.out.println("The angle in degrees is: " + (theta * (180/Math.PI)) + "\n");
	
	// compute theta using atan
	
	if (inputX > 0){
		theta = (Math.atan(inputY/inputX));
		System.out.println("The if statement ran (x > 0)\n");
		System.out.println("The angle of theta in radians is: " + theta);
		System.out.println("The angle in degrees is: " + (theta * (180/Math.PI)) + "\n");
	} // end if
	
	else if (inputX < 0){
		System.out.println("else if statement ran (x < 0)");
		theta = Math.atan(inputX/inputY);
		theta = theta + Math.PI;
		System.out.println("The angle of theta in radians is: " + (theta));
		System.out.println("The angle in degrees is: " + ((theta) * (180/Math.PI)) + "\n");
	}
	
	else if (inputX == 0){
		System.out.println("else if x == 0 has ran");
		    if (inputY == 0){
		       System.out.println("inputY == 0");
		    	System.out.println("The angle can only equal 0");
		    }
		    else if (inputY < 0){
		    	System.out.println("inputY < 0");
		    	System.out.println("The angle can only be 270 degrees");
		    }
		    else if (inputY > 0){
		    	System.out.println("inputY > 0");
		    	System.out.println("The angle can only be 90");
		    }
	}// end of else if X == 0
			
//	 End if
//	else {
//		System.out.println("The else statement ran\n");
//		
//		theta = Math.atan(((inputX/inputY) + Math.PI));
//		System.out.println("theta = " + theta);
//		System.out.println();
//		System.out.println("The angle of theta in radians is: " + theta);
//		System.out.println("The angle in degrees is: " + (theta * (180/Math.PI)) + "\n");


//	} // end else	
	
	
			
			
	
	System.out.println("The program has ended");
	
			
	} // End main method
} // end of the class