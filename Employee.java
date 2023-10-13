/**
 * 
 * @author Nia Jordan
 * 11/02/2022
 * 
 * This class creates employee objects, sets the name and ID Number, and returns the information.
 * COSC 2436 902
 */
public class Employee {
	
	private Integer IDNum;//Employee key
	private String name; //Employee name
	
	//Employee constructor
	public Employee(int i, String n) {
		
		IDNum = i;
		name = n;
		
	}
	
	//Sets employee ID Number
	public void setID(int i) {
		
		IDNum = i;
	}
	
	//Sets employee name
	public void setName(String s) {
			
			name = s;
	}
	
	//Gets the employee's ID Number
	public Integer getID() {
		
		Integer tempID = IDNum; 
		return tempID;
	}
	
	//Gets the employee's name
	public String getName() {
		
		String tempName = name;
		return tempName;
	}
	
	
	//Displays the generic information about the employee
	public String toString() {
		
		return "ID Number: " + (int)IDNum + "\nName: " + name;
	}
}
