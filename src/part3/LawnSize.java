package part3;
import java.util.Scanner;

public class LawnSize {
	public static void main(String [] args){   
		Scanner keyboard = new Scanner (System.in);
		Rectangle lawn = new Rectangle();
		// Get the lawn's length. 
		System.out.print("What is the length of your lawn, in feet? ");   
		double len = keyboard.nextDouble();   
		lawn.setLength(len); 
		
		// Get the Lawn's width
		System.out.print("What is the width of your lawn, in feet? ");  
	    double width = keyboard.nextDouble(); 
	    lawn.setWidth(width);
	    
	    // Get the Lawn's length 
	    System.out.println("Lawn length " + lawn.getLength() );   
	    System.out.println("Lawn width " + lawn.getWidth() );   
	    System.out.println("It is " + lawn.getPerimeter()  + " feet around your lawn.");     
	    
	    keyboard.close();
    } 
}
