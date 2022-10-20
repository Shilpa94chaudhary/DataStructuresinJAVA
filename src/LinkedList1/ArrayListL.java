package LinkedList1;

import java.util.ArrayList;

public class ArrayListL {

	public static void main(String[] args) {
		
		ArrayList <Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(30);
		arr.add(40);
		// This statement will print size of ArrayList
		System.out.println("Size of ArrayList "+arr.size());
		// This statement will print value at index 1
		System.out.println("Value at index 1 "+arr.get(1));
		
		// This statement will insert number at index 1, all elements from index 1 will shift to right
		arr.add(1,20);
		// This statement will print size of ArrayList
		System.out.println("Size of ArrayList "+arr.size());
		// This statement will print value at index 1
		System.out.println("Value at index 1 "+arr.get(1));

		System.out.println("Value at index 2 "+arr.get(2));
		// This statement will set the index value of 20 at index 2
		arr.add( 2,arr.indexOf(20) );
		System.out.println("Value at index 2 "+arr.get(2));
		// This statement will replace the value at index 2 by 80
		arr.set( 2, 80 );
		System.out.println("Value at index 2 "+arr.get(2));
		
		// This statement will remove element at index 2, and shift all elements to the left
		arr.remove(2);
		System.out.println("Value at index 2 "+arr.get(2));
		
		for(int j=0 ; j<arr.size() ; j++) {
			System.out.println("Index " + j + " value = " + arr.get(j));
		}
		
		// To remove a specific integer value from list, we have to specify the integer value
		Integer i = 20;
		arr.remove(i);
		
		// Print all elements in an array list
		for(int j=0 ; j<arr.size() ; j++) {
			System.out.println("Index " + j + " value = " + arr.get(j));
		}
		
		// Enhanced for loop
		for(int j : arr) {
			System.out.println(j);
		}

	}

}
