// Perrfection Peterkin 10/18/19 
//This class demonstrates Geometry through user interaction as a Geometry calculator 
package hw5;
import java.util.Scanner;    //so we can use scanner to identify the user input
import hw5.Geometry;           //so we can use circle to create circle objects

public class GeometryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t = true;
		Scanner Keybored = new Scanner(System.in);
		System.out.println("This program can calculate the area of circles, rectangles and triangles.");
		while (t == true) {
			System.out.println("1. Calculate the Area of a Circle \n"+   // menu
			                   "2. Calculate the Area of a Rectangle \n"+
	                           "3. Calculate the Area of a Triangle \n"+
	                           "4. Quit \n"+
	                           "Enter your choice (1—4):");
			int choice = Keybored.nextInt();
			if (choice >=1 & choice <= 4) {                                            // while the user chooses an integer between 1-4
				switch(choice) {
					case 1:
						System.out.println("1. Calculate the Area of a Circle \n"+
											"Enter the radius of the circle:");
						double r = Keybored.nextDouble();
						System.out.println("The area of the circle with radius "+ r +
								           " is equal to " + Geometry.areaOfCir(r) + ".");
						break;
					case 2:
						System.out.println("2. Calculate the Area of a Rectangle \n"+
								           "Enter the length of the rectangle:");
						double l = Keybored.nextDouble();
						System.out.println("Enter the width of the rectangle:");
						double w = Keybored.nextDouble();
						System.out.println("The area of the rectangle with length "+ l +
					           " and width " + w + " is equal to " + Geometry.areaOfRec(l,w) + ".");
						break;
					case 3:
						System.out.println("3. Calculate the Area of a Triangle \n"+
						                   "Enter the length of the triangle:");
						double b = Keybored.nextDouble();
						System.out.println("Enter the height of the triangle:");
						double h = Keybored.nextDouble();
						System.out.println("The area of the rectangle with base "+ b +
								" and height " + h + " is equal to " + Geometry.areaOfTri(b,h) + ".");
						break;
					case 4:
						t = false; // "quite" ends while loop
						break;
				}
			}
			else {
				System.out.println("Error. Input is invalid, please enter 1, 2, 3 or 4.");   // if user dosn't input an integer between 1-4
			}
		}
		System.out.println("GoodBye");	
	}

}
