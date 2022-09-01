package OOPS1;

public class StudentUse {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1);
		System.out.println(s1.name + " " + s1.rollNumber);
		
		s1.name = "Shilpa";
		s1.rollNumber = 34;
		
		s2.name = "Neema Adikari";
		s2.rollNumber = 26;
		
		System.out.println(s1.name + " " + s1.rollNumber);
		System.out.println(s2.name + " " + s2.rollNumber);

	}

}
