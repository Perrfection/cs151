//perrfection Peterkin 9/16/19
//this code holds information for a circle object

package hw3;

public class Circle {  //Constructor. Accepts the radius of the circle as an argument.
	private double radius;
	final double PI = 3.141159;
	
	public void setRadius(double radius) {//A mutator method for the radius field.
		this.radius = radius;
	}
	public double getRadius() {//An accessor method for the radius field. 
		return radius;
	}
	public double getArea() {//Returns the area of the circle, which is calculated as area = PI * radius * radius
		return PI*radius*radius;
	}
	public double getDiameter() {//Returns the diameter of the circle, which is calculated as diameter = radius * 2
		return radius*2;
	}
	public double getCircumference() {//getCircumference. Returns the circumference of the circle, which is calculated as circumference = 2 * PI * radius
		return 2*PI*radius;
	}
}
