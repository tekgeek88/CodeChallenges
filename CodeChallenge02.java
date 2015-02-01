/**
 * The purpose of this program is to define lengths a, b, c.
 * The program will calculate the Perimeter, Semiperimeter, and Area.
 *
 *
 * @author Tyler Fleckenstein
 * @author Carl Argabright
 * @author Garrett Engle
 *
 */

public class CodeChallenge02 { // beginning of class

	public static void main(String[] args) { // beginning of main method
		
		// Define all variables 
		Double aLength, bLength, cLength;
		Double Perimeter, sPerimeter, Area;
		
		//Display intro graphics
				System.out.println("\n\n           ,********************************************,");
				System.out.println("           '**                                        **'");
				System.out.println("           '**    This program uses Heron's Formula   **'");
				System.out.println("           '**                    to                  **'");
				System.out.println("           '**   Calculate the area of any triangle!  **'");
				System.out.println("           '**                                        **'");
				System.out.println("           '********************************************'\n\n");
				System.out.println("	                      Directions:\n");
				System.out.println("     1.  Enter the lenghts of ALL three sides of a triangle\n\n");
		
		// Ask for input value for length a
		System.out.print("Enter the length of side 'a': ");
		aLength = TextIO.getlnDouble();
		
		// Ask for input value for length b
		System.out.print("Enter the length of side 'b': ");
		bLength = TextIO.getlnDouble();
		
		// Ask for input value for length c
		System.out.print("Enter the length of side 'c': ");
		cLength = TextIO.getlnDouble();
		
		// Calculate the perimeter by adding all 3 lengths
		Perimeter = aLength + bLength + cLength;
		
		// Calcualte the semiperimeter by dividing the perimeter by 2.
		sPerimeter = Perimeter / 2;
		
		// Calculate the area by the formula provided in the challenge details.
		Area = Math.sqrt(sPerimeter * (sPerimeter - aLength) 
				* (sPerimeter - bLength) * (sPerimeter - cLength));
		
		if (Area.isNaN()){
			System.out.println("\n\nThe lenght of of one side cannot be greater than the sum of the other two sides\n\n");
		}//end if
		else{
			System.out.println("\n\nThe Perimeter of a triangle with side lengths (a) " + aLength);
			System.out.println("                                              (b) " + bLength);
			System.out.println("                                              (c) " + cLength + " is " + Perimeter);
			
			// Display the area
			System.out.printf("\n                    And has a total area of: ");
			System.out.println();
			System.out.println("                    888888888888888888888888");
			System.out.println("                    8                      8");
			System.out.printf("                    8         " + "%-10.2f", Area);
			System.out.println("   8");
			System.out.println("                    8                      8");
			System.out.println("                    888888888888888888888888");
			
		} //end else if
		
		System.out.println(" \n\n\n\nThe program has completed succesfully!");
		} // End of main() method
		 
} // End of Public Class Sequential_Operation