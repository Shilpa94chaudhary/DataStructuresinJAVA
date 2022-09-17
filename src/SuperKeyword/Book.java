package SuperKeyword;

public class Book {
	String author;
	int noOfPages;
	private double price;
	
	public void print() {
		System.out.println("Book Class Print - Author: " + author + ", No of pages: " 
				+ noOfPages + ", Price: " + price);
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
