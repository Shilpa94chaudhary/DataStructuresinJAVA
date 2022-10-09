package ClassObjectPackage1;

public class StudentInfoUse1 {

	public static void main(String[] args) {
	
		StudentInfo s1 = new StudentInfo();
		String s="Shilpa";
		s1.name = s;
		
		// This will give an error as rollNumber is private variable, 
		// so not accessible outside the class
		// s1.rollNumber = 5;
		//System.out.println(s1.name + " " + s1.rollNumber);
		
		/* Note
		 * The class is of Type student and it would be followed by a hexadecimal code.
		 * So the address would be like Student@.....
		 * hexadecimal code.
		 */

	}

}
