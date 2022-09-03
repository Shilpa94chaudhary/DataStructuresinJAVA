package ClassObjectPackage2;

import ClassObjectPackage1.StudentInfo;

public class StudentInfoUse2 {

	public static void main(String[] args) {
		
		StudentInfo s1 = new StudentInfo();
		
		// This will give an error as name is default variable, 
		// so not accessible outside the package
		// s1.name = "Shilpa";
		// System.out.println(s1.name);
		
		// standard is public variable, we can access outside class
		s1.standard = 4;
		System.out.println(s1.standard);
	}

}