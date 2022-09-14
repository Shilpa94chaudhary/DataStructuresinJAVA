package Inheritance;

public class Vehicle {
	String color;
	String brandName;
	int price;
	
	public void print() {
		System.out.println("Vehicle:\nBrand: " + this.brandName + " Color: " 
				+ this.color + " Price: "+ this.price);
	}
}
