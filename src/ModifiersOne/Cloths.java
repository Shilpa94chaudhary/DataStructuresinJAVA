package ModifiersOne;

public class Cloths {

	private int manufacturingCost;
	public int price;
	private String material;
	
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
}
