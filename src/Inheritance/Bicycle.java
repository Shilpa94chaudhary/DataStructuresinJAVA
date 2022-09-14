package Inheritance;

public class Bicycle extends Vehicle {
	int cc;
	
	public void printBicycle() {
		System.out.println("Bicycle:\nBrand: " + this.brandName + " Color: " 
				+ this.color + " Price: "+ this.price +" CC: " + this.cc);
	}
}
