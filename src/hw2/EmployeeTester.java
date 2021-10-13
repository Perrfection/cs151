//Perrfection Peterkin 9/16/19
//this code creates and defines employee objects

/*Once you have written the class, write a separate program that creates three 
  Employee objects to hold the following data:
  
	  Name          ID Number   Department     Position 
	  Susan Meyers  47899       Accounting     Vice President 
	  Mark Jones    39119       IT             Programmer 
	  Joy Rogers    81774       Manufacturing  Engineer
	  
  The program should store this data in the three objects, then display the data for each 
  employee on the screen. */

package hw2;

import java.util.Scanner;  //calls scanner module so it can be used 
import hw2.Employee;       //calls Employee object so it can be used 

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		Employee e1 , e2, e3;                         // creates all three objects
		
		e1 = new Employee();                          // defines object 1
		e1.setName("Susan Meyers");
		e1.setIdNum(47899);
		e1.setDepartment("Accounting");
	    e1.setPosition("Vice President");
	    
		e2 = new Employee();                          //defines object 2 
		e2.setName("Mark Jones");
		e2.setIdNum(39119);
		e2.setDepartment("IT");
	    e2.setPosition("Programmer");
	    
		e3 = new Employee();                          //defines object 3
		e3.setName("Joy Rogers");
		e3.setIdNum(81774);
		e3.setDepartment("Manufacturing");
	    e3.setPosition("Engineer");
	    
	    //displays all info
	    System.out.println("Name \t\t IdNumber \t Department \t Position");
	    System.out.println(e1.getName() + " \t " + e1.getIdNum() + " \t\t " + e1.getDepartment() + " \t "+e1.getPosition()); 
	    System.out.println(e2.getName() + " \t " + e2.getIdNum() + " \t\t " + e2.getDepartment() + " \t\t "+e2.getPosition());
	    System.out.println(e3.getName() + " \t " + e3.getIdNum() + " \t\t " + e3.getDepartment() + " \t "+e3.getPosition());

	}

}
