//Perrfection Petrekin 10/26/19
//Class: SpeedOfSoundTester
/*Purpose:  
    This program will display a menu in which a user must select air, water, or steel.
	Once the user has made a selection, they will be asked to enter the distance a sound wave will travel.
	The program will then display the amount of time it will take for the sound wave to travel in that particular medium.
 */
package hw4;

import java.util.Scanner;    //so we can use scanner to identify the user input

public class SpeedOfSoundTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float time = 0;               
		float distance;               
		String medium = "";           
		Scanner keyboard = new Scanner (System.in);               //creates new scanner
		SpeedOfSound t1 = new SpeedOfSound();                     //creates new SoundOfSpeed object
		System.out.print("This program will display a menu in which you must select air, water, or steel. \n" +
				"Once you have made a selection, you will be asked to enter the distance a sound wave will travel.\n" +
				"The program will then display the amount of time it will take. for the sound wave to travel in that particular medium. \n" +
				"Please enter lower case 'a' for air, 'w' for water or, 's' for steel.");            //request user input for medium
	    String userMedium = keyboard.nextLine();                                          //Sets "userMedium" as user input for medium
	    System.out.print("Please enter a distance in feet:");                             //request user input for distance
	    distance = keyboard.nextFloat();                                                  //sets "distance" as user input for distance 
	    t1.setDistance(distance);                                                         //sets distance to be used in SpeedOfSound class
    	switch (userMedium) {                                                             //Determines distance using the Medium declared by the user
	    	case "a":                                     
	    		time = t1.getSpeedInAir(); 
	    		medium = "air";
	    		break;    
	    	case "w":      
	    		time = t1.getSpeedInWater();
	    		medium = "water";
	    		break;    
	    	case "s":      
	    		time = t1.getSpeedInSteel();
	    		medium = "steel";
	    		break;
	    	default:    
	    		medium = "an undetermined medium";
	    		System.out.println("Error: Invalid medium ");      
	    		break;
	    }
    	System.out.print("It will take "+ time +" seconds for a sound wave to travel "+ distance +" feet through "+ medium +".");
	}
}
