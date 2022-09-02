package OOPS1;

public class StudentUse {

	public static void main(String[] args) {
	
		Student s1;  // Reference is created
		s1 = new Student();    // Object is created 
		Student s2 = new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.name + " " + s1.rollNumber);
		
		s1.name = "Shilpa";
		s1.rollNumber = 34;
		
		s2.name = "Neema Adikari";
		s2.rollNumber = 26;
		
		System.out.println(s1.name + " " + s1.rollNumber);
		System.out.println(s2.name + " " + s2.rollNumber);

		/* Note
		 * The class is of Type student and it would be followed by a hexadecimal code.
		 * So the address would be like Student@.....
		 * hexadecimal code.
		 */
	}

}
