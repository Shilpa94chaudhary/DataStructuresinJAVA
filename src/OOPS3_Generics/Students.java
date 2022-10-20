package OOPS3_Generics;

public class Students implements PrintInterface {

	int rollNumber;

	public Students(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public void print() {
		System.out.println(rollNumber);
	}
}
