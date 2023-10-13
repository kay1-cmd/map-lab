/**
 * 
 * @author Nia Jordan
 * 11/02/2022
 * 
 * This class demonstrates employee class and the employee map class.
 * 
 * COSC 2436 902
 *
 */

public class EmployeeDemo {
	public static void main(String[] args) {
		
		//create employee objects, pass key(ID Number) and name
		Employee webDev = new Employee(9708, "Jordan");
		Employee gameDev = new Employee(2301, "Alex");
		
		//create employee map class, uses a Hash Map DS
		EmployeeMap temp = new EmployeeMap();
		
		//Add the employees to the map
		temp.add(webDev);
		temp.add(gameDev);
		
		
		//Search for the employee by their ID Number and display their info
		System.out.println("Searching for employee 9708...");
		System.out.println(temp.lookup(9708));
		
		System.out.println();
		System.out.println();
		
		System.out.println("Searching for employee 2301...");
		System.out.println(temp.lookup(2301));
		
	}
}
