package FinalVariable;

public class ProductInfo {

	private String name;
	private double price;
	final private int gst = 18;
	final int discount;
	private double totalPrice;
	
	public ProductInfo(String name, double price, int discount) {
		this.name=name;
		this.price=price;
		this.discount = discount;
	}
	
	public double calculateTotalPrice() {
		double totalPrice = this.price + (this.price * gst /100) - (this.price * this.discount /100);
		return totalPrice;
	}
	
	public void productInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Gst Applied: " + this.gst+ "%");
		System.out.println("Discount Applied: " + this.discount + "%");
		this.totalPrice=this.calculateTotalPrice();
		System.out.println("Total price: Rs." + this.totalPrice);
	}
	
	/* Note: 
	 * Final variable can be initialized only once and cannot be modified further. 
	 * We can initialize final variable inside constructor. 
	 * Final keyword is a non-access modifier. 
	 */
	
}
