package StaticVariableFunction;

public class StudentInfo {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.setStudentDetails("Shilpa Chaudhary", 7.8);
		s1.getStudentDetails();
		Student1 s2 = new Student1();
		s2.getStudentDetails();
		System.out.println("Value of numStudent before assigning externally: " + Student1.numStudent);
		
		/* As Static variable if default variable, anyone can change the value of 
		 * numStudent outside the Class
		 */
		s2.numStudent = 100;
		
		
		// Static variables are property of class not object
		// Static variable can directly accessible by class name
		
		System.out.println("Value of numStudent after assigning externally: " +Student1.numStudent);
		
		
//		System.out.println(s1.numStudent);
//		System.out.println(s2.numStudent);
		
		
		/* Static Function Use */
		
		Student2 S1 = new Student2();
		S1.setStudentDetails("Purnima Choudhary", 8.2);
		S1.getStudentDetails();
		Student2 S2 = new Student2();
		S2.setStudentDetails("Pooja", 6.5);
		S2.getStudentDetails();
		
		System.out.println(Student2.getNumStudent());
		System.out.println(S1.getNumStudent());		
		/* These statements will give an error as numStudent is private static variable
		 * and cannot be access outside the class
		 */
//		S2.numStudent = 100;
//		System.out.println("Value of numStudent before assigning externally: " + Student2.numStudent);

	}

}
