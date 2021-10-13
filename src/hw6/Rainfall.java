//Perrfection Peterkin
/*	1. Rainfall Class Write a RainFall class that stores the total
	rainfall for each of 12 months into an array of doubles. 
	The program should have methods that return the following: 
		total rainfall for the year
		the average monthly rainfall
		the month with the most rain 
		the month with the least rain 
	Demonstrate the class in a complete program. 
	Input Validation: Do not accept negative numbers for monthly rainfall figures. */
package hw6;

public class Rainfall {
	//new array
	private double[] rain = new double[12];
	//constructor: asks user for rain fall of all 12 months
	public Rainfall (double[] r) {
		for (int i = 0; i < r.length; i++) {
		rain[i] = r[i];
		}
	}
	//add up all the rain fall for that year 
	public double getTotalRainFall(){
		double total = 0;
		for (int i = 0; i < rain.length; i++) {
			total = total + rain[i];
		}
		return total;
	}
	//Divide total rainfall by 12 to get average rain fall
	public double getAverageRainFall(){
		return getTotalRainFall()/12;
	}
	//look through array for the month with the highest rain fall
	public int getHighestMonth(){
		int m = 0;
		double high = rain[0];
		for (int i = 1 ; i < rain.length; i++) {
			if (high < rain[i]) {
				high = rain[i];
				m = i;
			}
		}
		return m+1;
	}
	//look through array for the month with the lowest rain fall
	public int getLowestMonth(){
		int m = 0;
		double low = rain[0];
		for (int i = 1 ; i < rain.length; i++) {
			if (low > rain[i]) {
				low = rain[i];
				m = i;
			}
		}
		return m+1;
	}
	//return rainfall of a specified month 
	public double getRainAt (int m){
		return rain[m];
	}
}	