//Perrfection Peterkin
package hw7;

/*Phone Book ArrayList Write a class named PhoneBookEntry that has fields for
a person’s name and phone number. The class should have a constructor and 
appropriate accessory and mutator methods. Then write a program that creates 
at least five PhoneBookEntry objects and stores them in an ArrayList. Use a 
loop to display the contents of each object in the ArrayList.
*/

public class PhoneBookEntry {
	String name;
	String phoneNumber;
	
	public PhoneBookEntry(String n, String pn){   
		//constructor: ask for name and phone number whenever a new phonebookentry object is created 
		name = n;
		phoneNumber = pn;
	}
	
	public void setName(String n){ 
		name = n;
	}
	
	public void setPhoneNumber(String pn){
		name = pn;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public String getName(){
		return name;
	}
}
