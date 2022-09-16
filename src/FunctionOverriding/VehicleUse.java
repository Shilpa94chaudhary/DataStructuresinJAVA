package FunctionOverriding;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.print();
		v.color = "Blue";
		v.brandName = "Tata";
		v.setPrice(60000);
		v.print();
		
		Car c = new Car();
		c.brandName = "";
		c.color = "Grey";
		c.setPrice(75000);
		c.numSeats = 4;
		// As there is a print() function in Car class, this statement will call
		// print() function of Car class not the Vehicle class
		c.print();
		
		Bicycle b = new Bicycle();
		b.brandName = "";
		b.color = "Grey";
		b.setPrice(60000);
		b.cc = 230;
		// As there is no print() function in Bicycle class, this statement will call
		// print() function of Vehicle class
		b.print();

	}

}
