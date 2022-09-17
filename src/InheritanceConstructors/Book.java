package InheritanceConstructors;

public class Book {
	String author;
	int noOfPages;
	private double price;
	
	public Book() {
		System.out.println("Book Constructor");
	}
	public void print() {
		System.out.println("Book Class Print - Author: " + author + ", No of pages: " 
				+ noOfPages + ", Price: " + price);
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
