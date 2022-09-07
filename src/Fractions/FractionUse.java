package Fractions;

public class FractionUse {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(1,2);
		System.out.println("Before increment");
		f1.print();
		
		// Call to increment function
//		f1.increment();
//		System.out.println("After increment: ");
//		f1.print();
		
		Fraction f2 = new Fraction(1,6);
		f2.print();
		
		
		System.out.println("Addition of two fractions : ");
		f1.print();
		f2.print();
		
		// Call to add function, add function will add f1 and f2 and modify f1
		f1.addFraction(f2);
		f1.print();
		
		// This will call the static function of the Fraction class which returns an object
		Fraction f3 = Fraction.addFraction(f1, f2);
		f3.print();
		
	}

}
