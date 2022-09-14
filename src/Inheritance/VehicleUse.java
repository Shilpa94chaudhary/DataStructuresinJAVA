package Inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.print();
		v.color = "Blue";
		v.brandName = "Tata";
//		Price is private variable, cannot access outside the class
//		v.price = 23000;
		v.setPrice(60000);
		v.print();
		
		Car c = new Car();
		c.brandName = "";
		c.color = "Grey";
//		Price is private variable, cannot access outside the class
//		c.price = 50000;
		c.setPrice(75000);
		c.numSeats = 4;
		c.print();
		c.printCar();

		Bicycle b = new Bicycle();
		b.brandName = "";
		b.color = "Grey";
//		Price is private variable, cannot access outside the class
//		b.price = 60000;
		b.setPrice(60000);
		b.cc = 230;
		b.print();
		b.printBicycle();
	}

}
