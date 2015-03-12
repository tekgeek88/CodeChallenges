// This file convert Cartesian coordinates into polar coordinates and gives the related angle

import java.text.DecimalFormat; // allows for custom format of numbers

public class Cs142Hw4ArgabrightCarl {

    /* A program that converts Cartesian coordinates
     * into polar coordinates
     * @author Carl Argabright
     * @author Garrett Engle
     * @author Tyler Fleckenstein
     * @author Amy Irving
     */

    public static void main(String[] args) {

        //Declare the variables
        double inputX, inputY, radius, theta;
        boolean tryAgain = true;
        DecimalFormat df = new DecimalFormat("###,###.##");  // Makes the result easy on the eyes

        while (tryAgain){

            // Display fancy intro to user
            System.out.println("\n\n\n        .==========================================================.");
            System.out.println("        *                                                           *");
            System.out.println("        *              Converts Cartesian coordinates               *");
            System.out.println("        *                  into polar coordinates                   *");
            System.out.println("        *                    By: Carl Argabright                    *");
            System.out.println("        *                    By: Amy Irving                         *");
            System.out.println("        *                    By: Garret Engle                       *");
            System.out.println("        *                    By: Tyler Fleckenstein                 *");
            System.out.println("        *                                                           *");
            System.out.println("        *                   CS 142 - Dr. Basham                     *");
            System.out.println("        '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~'\n");
            System.out.println("                             **  Directions  **\n");
            System.out.println("                    Step 1: Enter the X and Y coordinates.");
            System.out.println("                    Step 2: Exponential problem solved.\n");
            System.out.println("       .______________________________________________________________.");
            System.out.println("       |                                                              |");
            System.out.println("       |  ** Tip: X and Y coordinates can be negative or positve **   |");
            System.out.println("       |                                                              |");
            System.out.println("       '——————————————————————————————————————————————————————————————'");
            System.out.println("");
            System.out.println("    ==================================================================================\n\n");


            //Gather the Cartesian coordinates from the user
            System.out.println("Please enter the Cartesian coordinates...\n");
            System.out.print("Enter the \"X\" coordinate: ");
            inputX = TextIO.getDouble();
            System.out.print("Enter the \"Y\" coordinate: ");
            inputY = TextIO.getDouble();
            System.out.println("\nThe coordinates you intered are (" + df.format(inputX) + "," + df.format(inputY) + ")");  // verify the result entered


            //Solve for the hypoteneuse
            radius = Math.hypot(inputX, inputY);
            System.out.println("The radius is: " + df.format(radius) + "\n");

            /*
             * By using this method we could arrive at the answer with the angle already
             * adjusted for the correct position
             * 
             * Compute theta using atan2
             * theta = Math.atan2(inputX, inputY);
             * System.out.println("The angle in radians is: " + theta );
             * System.out.println("The angle in degrees is: " + (theta * (180/Math.PI)) + "\n");
             * 
             */

            // Solve the long way
            if (inputX > 0){
                theta = (Math.atan(inputY/inputX));
                System.out.println("The angle of theta in radians is: " + df.format(theta));
                System.out.println("The angle in degrees is: " + df.format((theta * (180/Math.PI))) + "\n");
            } // end if

            else if (inputX < 0){
                theta = Math.atan(inputX/inputY);
                theta = theta + Math.PI;
                System.out.println("The angle of theta in radians is: " + df.format(theta));
                System.out.println("The angle in degrees is: " + df.format((theta * (180/Math.PI))) + "\n");
            }

            else if (inputX == 0){
                if (inputY == 0){
                    System.out.println("The angle can only equal 0");
                }
                else if (inputY < 0){
                    System.out.println("The angle can only be 270 degrees");
                }
                else if (inputY > 0){
                    System.out.println("The angle can only be 90");
                }
            }// end of else if X == 0

            // Option to allow user to continue checking coordinates
            System.out.println("Would you like to enter another set of coordinates?");
            System.out.print("Enter yes/no, 1/0 or y/n: ");
            tryAgain = TextIO.getBoolean();

        } // end of while loop

        System.out.println("\nThe program has ended successfuly!");

    }// end main method

} // end of the class

