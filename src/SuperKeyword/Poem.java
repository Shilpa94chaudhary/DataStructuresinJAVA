package SuperKeyword;

public class Poem extends Book{

	double price;
	
	public void print() {
		super.print();
		System.out.println("Poem Class Print - Author: " + author + ", No of pages: " 
				+ noOfPages + ", Price(GST Included: " + price);
	}

	public void setPrice(double price) {
		super.setPrice(price);
		double newPrice = price * 1.18;
		this.price = newPrice;
	}

	public void setAuthor(String author) {
		super.author = author;
		
	}

	public void setNoOfPages(int noOfPages) {
		super.noOfPages = noOfPages;
	}
	
}
