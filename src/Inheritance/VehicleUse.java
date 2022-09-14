package Inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.print();
		v.color = "Blue";
		v.brandName = "Tata";
		v.price = 23000;
		v.print();
		
		Car c = new Car();
		c.brandName = "";
		c.color = "Grey";
		c.price = 50000;
		c.numSeats = 4;
		c.print();
		c.printCar();

		Bicycle b = new Bicycle();
		b.brandName = "";
		b.color = "Grey";
		b.price = 60000;
		b.cc = 230;
		b.print();
		b.printBicycle();
	}

}
