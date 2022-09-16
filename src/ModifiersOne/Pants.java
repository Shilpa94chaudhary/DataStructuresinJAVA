package ModifiersOne;

public class Pants extends Cloths {
	String gender;
	String size;
	
	public Pants() {
		System.out.println("Pants constructor");
	}
	
	public void print() {
		System.out.println("Pants Class\n" + "Price " + price + " Material " 
	    + material + " Gender " + gender + " Size " + size);
	}
}
