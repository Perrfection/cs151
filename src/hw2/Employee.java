//Perrfection Peterkin 9/16/19
/*this code holds employee object information: name, id number, 
the department they work in, and their position or job title*/

package hw2;

public class Employee {
	private String name;            //The name field is a String object that holds the employee’s name. 
	private int idNum;              //The idNumber is an int variable that holds the employee’s ID number. 
	private String department;      //The department field is a String object that holds the name of the department
	                                     //where the employee works. 
	private String position;        //The position field is a String object that holds the employee’s job title. 
	
	public void setName(String name) {    //Declares name variable 
		this.name = name;
	}
	public void setIdNum(int idNum) {     //Declares idNumber variable 
		this.idNum = idNum;
	}
	public void setDepartment(String dep) {  //Declares department variable 
		department = dep;
	}
	public void setPosition(String pos) {  //Declares position variable 
		position = pos;
	}
	public String getName() {             //returns name variable 
		return name;
	}
	public int getIdNum() {                //returns idNumber variable
		return idNum;
	}
	public String getDepartment() {        //returns department variable
		return department;
	}
	public String getPosition() {          //returns position variable
		return position;
	}
	
}
