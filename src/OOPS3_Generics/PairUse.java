package OOPS3_Generics;

public class PairUse {

	public static void main(String[] args) {
		
		// Create an object of Integer type
		Pair<Integer> p1 = new Pair<>(10,20);
		System.out.println(p1.getFirst() + " " + p1.getSecond());
		
		// Create an object of String type
		Pair<String> p2 = new Pair<>("Hello","World");
		System.out.println(p2.getFirst() + " " + p2.getSecond());
		
		// Create an object of Double type
		Pair<Double> p3 = new Pair<>(3.14,9.45);
		System.out.println(p3.getFirst() + " " + p3.getSecond());
		
		
		// Create an object of class Vehicle type
		Vehicle v1 = new Vehicle("Honda");
		Vehicle v2 = new Vehicle("TVS");
		Pair<Vehicle> p4 = new Pair<>(v1, v2);
		p4.getFirst().printVehicle();
		p4.getSecond().printVehicle();
		
		
		int i = 10;
		// i1 is reference to the memory where value 10 is stored, i1 can be null
		Integer i1 = 10;
		System.out.println(i + " " + i1);
		
		// Multiple Generic 
		MultipleGenericPair <Integer, String> m1 = new MultipleGenericPair<>(10, "Hello");
		System.out.println(m1.getFirst() + " " + m1.getSecond());
		
	}

}
