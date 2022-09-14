package Inheritance;

public class Car extends Vehicle {
	int numSeats;
	
	public void printCar() {
		System.out.println("Car:\nBrand: " + this.brandName + " Color: " 
				+ this.color + " Price: "+ getPrice() +" No of seats: " + this.numSeats);
	}
}
