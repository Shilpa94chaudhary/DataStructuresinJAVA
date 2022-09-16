package ModifiersTwo;

import ModifiersOne.Cloths;

public class Shirts extends Cloths{
	String gender;
	String size;
	
	public Shirts() {
		System.out.println("Shirts constructor");
	}
	
	public void print() {
		System.out.println("Shirts Class\n" + "Price " + price + " Material " 
	    + material + " Gender " + gender + " Size " + size);
	}
}
