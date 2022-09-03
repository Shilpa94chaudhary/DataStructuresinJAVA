package Constructors;

public class Employee {
	private String name;
	private int empID;
	private String company;
	
	// Default constructor - no arguments are give
	public Employee() {
		
		/* this("Shilpa",15,"Gamezop"): will call the constructor with all the arguments
		 * this("Shilpa")
		 * When the object of Employee class is created,
		 * the constructor with no arguments is called.
		 * When  ("Shilpa",15,"Gamezop") is encountered ,
		 * the constructor with three arguments String, int and String
		 * is called because this is the reference of the object. 
		 * So using this way we can call more than one constructor.
		 */
		
//		this("Shilpa",15,"Gamezop");
		
		System.out.println("Call to default constructor");

	}
	
	// Constructor with only one argument: name
	public Employee(String name) {
		System.out.println("Call to constructor with one argument: name");
		this.name = name;
	}
	
	// Constructor with all arguments
	public Employee(String name, int empID, String company) {
		System.out.println("Call to constructor with all arguments");
		this.name = name;
		this.empID = empID;
		this.company = company;
	}
	
	public void printEmpDetail() {
		System.out.println("Company: "+this.company+"\nEmployee Name: "+this.name+"\nEmployee ID:"+this.empID);
	}
}
