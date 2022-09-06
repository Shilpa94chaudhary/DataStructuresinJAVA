package StaticVariableFunction;

public class Student1 {

	public String name;
	final private int rollNumber;
	double cgpa;
	final static double conventionalFactor = 0.95;
	static int numStudent;
	
	public Student1() {
		numStudent++;
		rollNumber = numStudent;
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
