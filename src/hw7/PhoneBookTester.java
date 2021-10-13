//Perrfection Peterkin
package hw7;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create arraylist for phonebookentry type data
		ArrayList<PhoneBookEntry> PhoneBook = new ArrayList<PhoneBookEntry>(); 
		//Create new phonebookentry objects and add them to the arraylist phonebook
		PhoneBook.add(new PhoneBookEntry("Max", "555-555-5555"));
		PhoneBook.add(new PhoneBookEntry("Ken", "909-090-9090"));
		PhoneBook.add(new PhoneBookEntry("Madison", "588-888-8888"));
		PhoneBook.add(new PhoneBookEntry("Ryu", "333-333-0555"));
		PhoneBook.add(new PhoneBookEntry("Autumn", "666-666-5555"));
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Welcome to Phone Book. Phone Book is here to store "
				+ "all of \nyour contacts. Here is a list of your current contacts:\n");
		//print all the data in the array list phone book
		for (int x = 0; x < PhoneBook.size(); x++){ 
			PhoneBookEntry contact = (PhoneBookEntry)PhoneBook.get(x); 
			System.out.println(contact.getName() + 
					"    Phone:" + contact.getPhoneNumber() + "\n");
		}
	}
}
