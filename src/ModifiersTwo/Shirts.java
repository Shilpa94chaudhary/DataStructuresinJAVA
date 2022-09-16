package ModifiersTwo;

import ModifiersOne.Cloths;

public class Shirts extends Cloths{
	String gender;
	String size;
	
	public void print() {
		System.out.println("Shirts Class\n" + "Price " + price + " Material " 
	    + getMaterial() + " Gender " + gender + " Size " + size);
	}
}
