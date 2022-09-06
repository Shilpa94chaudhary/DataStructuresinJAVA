package Fractions;

public class FractionUse {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(1,2);
		System.out.println("Before increment");
		f1.print();
		f1.increment();
		System.out.println("After increment: ");
		f1.print();
		
		Fraction f2 = new Fraction(1,3);
		f2.print();
		
		
		System.out.println("Addition of two fractions : ");
		f1.print();
		f2.print();
		
		f1.addFraction(f2);
		f1.print();
		
	}

}
