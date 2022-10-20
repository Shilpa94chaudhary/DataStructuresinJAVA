package OOPS3_Generics;

public class Vehicle {
	private String company;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String company) {
		this.company = company;
	}

	public void printVehicle() {
		System.out.println(company);
	}
}
