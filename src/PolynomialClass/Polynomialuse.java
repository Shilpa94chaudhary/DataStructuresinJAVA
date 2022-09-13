package PolynomialClass;

public class Polynomialuse {

	public static void main(String[] args) {
		
		Polynomials p1 = new Polynomials();
		p1.setCoefficient(0,3);
		p1.setCoefficient(2,2);
		p1.print();
		
		Polynomials p2 = new Polynomials();
		p2.setCoefficient(0,3);
		p2.setCoefficient(1,4);
		p2.setCoefficient(2,5);
		p2.setCoefficient(3,2);
		p2.print();
		
		p1.add(p2);
		p1.print();
		p2.print();
		
		p2.multiply(p1);
		p2.print();
		p1.print();
		
//		Polynomials p3 = Polynomials.add(p1,p2);
//		p1.print();
//		p2.print();
//		p3.print();
		
	}

}
