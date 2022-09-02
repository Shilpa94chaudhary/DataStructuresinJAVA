package ClassObjectPachage2;

import ClassObjectPachage1.StudentInfo;

public class StudentInfoUse2 {

	public static void main(String[] args) {
		
		StudentInfo s1 = new StudentInfo();
		
		// This will give an error as name is default variable, 
		// so not accessible outside the package
		// s1.name = "Shilpa";
		// System.out.println(s1.name);
	}

}
