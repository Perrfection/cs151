//Perrfection 9/16/19 

/*6. Sales Prediction
The East Coast sales division of a company generates 65 percent of total sales.
Based on that percentage, write a program that will predict how much the East
Coast division will generate if the company has $8.3 million in sales this year. 
Hint: Use the value 0.65 to represent 65 percent.*/

package hw1;

public class SalesPrediction {
	public static void main(String [] args){  
		double eCSalesPercent = 0.65;                     //the percent of the campany's total sales that the east coast sales division generates 
		double totalSales = 8.3;                          //the amount of sales the company has this year
		double eCSales = eCSalesPercent * totalSales;     //the amount of sales the the East Coast sales division will generate this year ( in millions)
		
		
		System.out.println("the East Cost salse division generated $" + eCSales + "million worth of sales.");
	}
}
