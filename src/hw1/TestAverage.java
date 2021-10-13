//Perrfection Peterkin 9/16/19

/*Write a program that asks the user to enter three test scores. 
The program should display each test score, as well as the 
average of the scores.*/

package hw1;
import java.util.Scanner;      //calls scanner module so it can be used 
import java.util.ArrayList;    //calls array module so it can be used 


public class TestAverage {
	public static void main(String [] args){
		ArrayList<Double> testScores = new ArrayList<Double>();      //uses arraylist to neatly collect data 
		Scanner keyboard = new Scanner (System.in);                  //uses scanner to detect keys on keyboard for user input
		int numOfTest = 3;                                           //number of test scores
		double total = 0;                                            //total of all scores added together
		int i = 0;                                                   //counter
		while (i<numOfTest){                                         //loop to prevent repetitive code 
			System.out.print("Test score " + (i+1) + " is = ");      //request scores 1 through 3
			testScores.add(keyboard.nextDouble());                   //uses scanner to collect user input (saved in array testscores)
			total += testScores.get(i);                              //add score to total
			i++;                                                     //increase counter by 1
		}
		System.out.println("Your test scores are " + testScores);
		System.out.println("The average of the scores = " + total/numOfTest + ".");
	}
}
