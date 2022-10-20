package Interfaces;

public class InterfaceMain {

	/*
	 * We can not create an object for interface but we can create a reference.
	 * 
	 * Interface reference will point to the object of the class which is implementing that 
	 * interface.
	 * 
	 * Interface reference can not use the method belongs to class which is implementing that 
	 * interface.
	 */
	
	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle();
		
//		VehicleInterface vIi = new VehicleInterface();
		
		VehicleInterface vI;
		
		vI = new Vehicle();
		
		vI.getCompany();
		
//		vI.print();

	}

}
