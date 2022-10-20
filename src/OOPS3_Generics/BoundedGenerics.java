package OOPS3_Generics;

public class BoundedGenerics {

	public static <T extends PrintInterface> void printArray(T arr[]) {
		for(int i = 0; i<arr.length ; i++) {
			arr[i].print();
		}
	}
	public static void main(String[] args) {
		Students students[] = new Students[5];
		for(int i = 0; i<students.length ; i++) {
			students[i] = new Students(i+1);
		}
		
		printArray(students);
	}

}
