package Inheritance;

public class Bicycle extends Vehicle {
	int cc;
	
	public void printBicycle() {
		System.out.println("Bicycle:\nBrand: " + this.brandName + " Color: " 
				+ this.color + " Price: "+ getPrice() +" CC: " + this.cc);
	}
}
