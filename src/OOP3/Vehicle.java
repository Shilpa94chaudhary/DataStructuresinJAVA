package OOP3;

public class Vehicle {

	private String color;
	int maxSpeed;
	
	public Vehicle() {
		color = "red";
		maxSpeed = 260;
	}
	
	public final void setColor(String color) {
		this.color = color;
	}
	
	
	// This code will give an error because the final method cannot be overridden
//	public final String setColor(String color) {
//		this.color = color;
//		return this.color;
//	}
	
	public void getColor() {
		System.out.println(color);
	}
	
}
