package Fractions;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction (int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void print() {
		simplify();
		System.out.println(numerator + "/" + denominator);
	}
	
	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		
		for(int i = 2; i<=smaller; i++) {
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}

	public void increment() {
		numerator = numerator + denominator;
	}

	public void addFraction(Fraction f) {
		// First Fraction is the Fraction on which function is call
		// Second Fraction is passed
		this.numerator = (this.numerator * f.denominator) + (f.numerator * this.denominator);
		this.denominator = (this.denominator * f.denominator);
		simplify();
	}	
	
	public static Fraction addFraction(Fraction f1, Fraction f2) {
		int newNum = (f1.numerator * f2.denominator) + (f1.numerator * f2.denominator);
		int newDeno = f1.denominator * f2.denominator;
		Fraction f = new Fraction(newNum, newDeno);
		return f;
	}
}
