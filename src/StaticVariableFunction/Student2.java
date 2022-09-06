package StaticVariableFunction;

public class Student2 {
	
	/* static functions cannot use non-static variables.
	 * Static function cannot call non-static function.
	 * this or super keyword cannot be used inside a static function.
	 */
	
	public String name;
	final private int rollNumber;
	double cgpa;
	final static double conventionalFactor = 0.95;
	private static int numStudent;
	
	public Student2() {
		numStudent++;
		rollNumber = numStudent;
	}
	
	public static int getNumStudent() {
		/* This statement will give an error as static function can only
		 * access static variables 
		 */
//		System.out.println(rollNumber);
		return numStudent;
	}
	
	public void setStudentDetails(String name, double cgpa) {
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public void getStudentDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Roll Number : " + this.rollNumber);
		System.out.println("CGPA: " + this.cgpa);
	}

}
