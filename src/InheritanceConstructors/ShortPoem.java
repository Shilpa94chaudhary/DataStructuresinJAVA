package InheritanceConstructors;

public class ShortPoem extends Poem {
	String title;
	
	public ShortPoem() {
		System.out.println("ShortPoem Constructor");
	}
	
	public void print() {
		super.print();
		System.out.println("ShortPoem Class Print - Author: " + author + ", No of pages: " 
				+ noOfPages + ", Price(GST Included: " + price + ", Title: " + title);
	}
}
