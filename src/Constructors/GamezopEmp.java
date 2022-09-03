package Constructors;

public class GamezopEmp {

	public static void main(String[] args) {
	
		// Call to default constructor
		Employee e1 = new Employee();
		e1.printEmpDetail();
		
		// Call to constructor with name argument only
		Employee e2 = new Employee("Shilpa");
		e2.printEmpDetail();
		
		// Call to constructor with all arguments
		Employee e3 = new Employee("Dhruvam",154,"Gamezop");
		e3.printEmpDetail();

	}

}
