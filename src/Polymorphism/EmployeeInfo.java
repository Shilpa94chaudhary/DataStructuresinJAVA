package Polymorphism;

import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) {
		Employee e;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the choice(1/2): ");
		int c = s.nextInt();
		if(c == 1) {
			e = new HR();
		}else {
			e = new IT();
		}
		
		/* Print statement will be call at the run time so, 
		 * which ever class object is created
		 * the print function of that class will be called
		 */
		e.print();
		
		e.name = "Name";
		
		/* This statement will give an error, as when complier check and e cannot 
		 * access the property of sub class 
		 * Every child class is parent class but parent class is not sub class
		 */
//		e.shift = "Morning";
		
	}

}
