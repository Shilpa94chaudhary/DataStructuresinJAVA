package GettersAndSetters;

public class Employee {

	private String name;
	private int empID;
	
	public void setValue(String name, int empID) {
		// this keyword is a reference variable that refers to the current object
		// If we do not use this variable, name will assign value to itself not to the object
		// And there will be no change in the default value object.name will have NULL value
//		name = name;
		this.name = name;
		this.empID = empID;
	}
	
	public void getValue() {
		System.out.println("Employee name: "+this.name + "\nEmployee ID: "+this.empID);
	}
	
}
