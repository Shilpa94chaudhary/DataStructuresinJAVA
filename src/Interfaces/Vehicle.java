package Interfaces;

public class Vehicle implements VehicleInterface {

	@Override
	public boolean isMotorized() {
		
		return false;
	}

	@Override
	public String getCompany() {
		
		return null;
	}
	
	public void print() {
		System.out.println(pI);
	}

}
