//perrfection Peterkin 9/16/19
// this code asks for a radius and returns the dominations of the circle (area, diameter, and circumference)

package hw3;

import java.util.Scanner;    //so we can use scanner to identify the user input
import hw3.Circle;           //so we can use circle to create circle objects

public class CircleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);     
		Circle c1 = new Circle();                   //New circle object
		System.out.print("Enter radius = ");        //Asks user for radius
	    double radius = keyboard.nextDouble();      //Declares variable for user input
	    c1.setRadius(radius);                       //Sets object c1's radius to user input
	    System.out.println(" area = "+ c1.getArea() +"\n diameter = "+c1.getDiameter()+"\n circumference = "+c1.getCircumference()); //returns information 
	}

}
