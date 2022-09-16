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
		c.print();

	}

}
