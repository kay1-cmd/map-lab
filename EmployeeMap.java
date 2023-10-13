/**
 * @author Nia Jordan
 * 11/02/2022
 * 
 * This class implements the hash map data structure. 
 * It add employee objects into the map and finds the object by key(ID Number).
 * 
 * COSC 2436 902
 */
import java.util.*;

public class EmployeeMap{
	
	//Create a map object
	Map<Integer, Employee> empMap = new HashMap<>();
	
	//Adds employee key and value to the created map
	public void add(Employee a) {
		
		empMap.put(a.getID(), a);
	}
	
	//Lookups the employee by key(ID Number)
	public Object lookup(int i) {
		
		Integer temp = i;
		
		Employee found = empMap.get(temp);
		
		if(found != null) {
			
		return found;
		
		}else {
			return "employee not found";
		}
		
	}
	
	
}
