//Perrfection Peterkin 8/26/19
//Payroll- calculates grosspay using Payrate and hours 


package part1;
import java.util.Scanner;// import module 

public class Payroll {   
	public static void main(String[] args)  {
		int hours = 40;
		double grossPay, payRate = 25.0;
		grossPay = hours * payRate;      
		System.out.println("Your gross pay is $" + grossPay);   
		
		// good programming practices
		//**** comment 
		// Consent- use final and the name should be in all caps
		// final double INTEREST_RATE
		// Create a scanner object to read input
		Scanner keyboard  = new Scanner(System.in);
	}
}

