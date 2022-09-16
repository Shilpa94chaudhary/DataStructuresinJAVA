package FunctionOverriding;

public class Vehicle {
	String color;
	String brandName;
	private int price;
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void print() {
		System.out.println("Vehicle:\nBrand: " + this.brandName + " Color: " 
				+ this.color + " Price: "+ this.price);
	}
}
