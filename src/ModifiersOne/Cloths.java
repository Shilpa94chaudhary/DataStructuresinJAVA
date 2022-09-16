package ModifiersOne;

public class Cloths {

	private int manufacturingCost;
	public int price;
	// Protected variable is accessible in another package in derived/sub/child class
	protected String material;
	
	public Cloths() {
		System.out.println("Cloths constructor");
	}
	
	public void setManufacturingCost(int manufacturingCost) {
		this.manufacturingCost = manufacturingCost;
	}
	
	public int getManufacturingCost() {
		return manufacturingCost;
	}
	
	public void print() {
		System.out.println("Shirts Class\n" + "Price " + price + " Material " 
			    + material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
