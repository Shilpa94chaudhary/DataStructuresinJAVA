package FunctionOverriding;

public class Car extends Vehicle{
	int numSeats;
	
	public void print() {
		System.out.println("Car:\nBrand: " + this.brandName + " Color: " 
				+ this.color + " Price: "+ getPrice() +" No of seats: " + this.numSeats);
	}
	
}
