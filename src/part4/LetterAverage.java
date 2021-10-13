package part4;
import java.util.Scanner;

public class LetterAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in); 
		System.out.print("What is your test score?");
		double score = keyboard.nextDouble();
		String letScore;
		if (score < 60){
			letScore = "F";
		}
		else if (score < 70){
			letScore = "D";
		}
		else if (score < 80) {
			letScore = "C";
		}
		else if (score < 90) {
			letScore = "B";
		}
		else if (score <= 100){
			letScore = "A";
		}
		else {
			letScore = "?";
		}
		System.out.print("Your letter score is " + letScore );
	}

}
