// Perrfection Peterkin 10/18/19 
//This class can calculate the area of circles, rectangles and triangles
package hw5;

public class Geometry {
	public static double areaOfCir(double radius){ 
		double a=0;
		if (radius <0) {
			System.out.println("Error. number cannot be negative."); // if user input is negative print error
		}
		else {
			a = radius * Math.PI * 2;  //else set a to calculated area of shape 
		}
		return a;
	}
	public static double areaOfRec(double length, double width){ 
		double a= 0;
		if (length <0 || width <0) {
			System.out.println("Error. number cannot be negative.");// if user input is negative print error
		}
		else {
			a = length * width;  //else set a to calculated area of shape 
		}
		return a;
	}
	public static double areaOfTri(double base, double height){
		double a= 0;
		if (base <0 || height <0) {
			System.out.println("Error. number cannot be negative.");// if user input is negative print error
		}
		else {
			a = base * height * 0.5;  //else set a to calculated area of shape 
		}
		return a;
    } 
}
