//Perrfection Peterkin
package hw6;
import java.util.Scanner; 

public class RainfallTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("This code will anylize the rainfall over the spand of a year given your information about that years rainfall.");
		double[] rain = new double [12];
		
		// Get user input for the rainfall of each month of the year. 
		getAmounts(rain);
		
		Rainfall year = new Rainfall(rain);
		System.out.println("The total amount of rain was " + year.getTotalRainFall());
		System.out.println("The average amount of rain was " + year.getAverageRainFall());
		System.out.println("The month with the lowest amount of rain was " + year.getLowestMonth());
		System.out.println("The month with the highest amount of rain was " + year.getHighestMonth());
		System.out.println("Would you like to find the amount of rainfall during a specific month? Enter y for yes or n for no");
		String bol = keyboard.nextLine();
		if (bol.equals("y")) {
			System.out.println("Using the index 1-12 for months January though December respectively, which month would you like to know the rainfall for?");
			int month = keyboard.nextInt();
			if (month >= 1 && month <= 12) {
				System.out.println("The rainfall of month " + month + " is: " + year.getRainAt(month-1));
			}
			else{
				System.out.println("Error: Invalad input");
			}
		}
		else if (bol.equals("n")){
			System.out.println("Good Bye.");
		}
		else {
			System.out.println("Error: Invalad input. Good Bye.");
		}
	}

	public static void getAmounts(double[] array) {
		Scanner keyboard = new Scanner(System.in); 
		// Create a Scanner object for keyboard input. 
		System.out.println("Enter rainfall for each month in cm."); 

		// Get the rainfall for each month of the year. 
		for (int i= 0; i < array.length; i++) 
		{ 
		     System.out.print("Month " + (i + 1) + ": "); 
		     array[i] = keyboard.nextDouble(); 
		     while (array[i] < 0) {
		    	 System.out.println("Error: Invalad input. PLease enter an integer greater than or equel to 0.");
		    	 array[i] = keyboard.nextDouble(); 
		     }
		}
	}
}

