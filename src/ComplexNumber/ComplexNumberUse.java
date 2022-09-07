package ComplexNumber;

public class ComplexNumberUse {

	public static void main(String[] args) {
		
		ComplexNumbers c1 = new ComplexNumbers(2,5);
		c1.print();
		c1.setReal(4);
		c1.setImaginary(2);
		c1.print();

		ComplexNumbers c2 = new ComplexNumbers(1,4);
		c1.addComplexNumbers(c2);
		c1.print();
		c2.print();
		
		ComplexNumbers c3 = new ComplexNumbers(3,2);
		c3.multiplyComplexNumbers(c2);
		c3.print();
		c2.print();
		
		ComplexNumbers c4 = ComplexNumbers.addComplexNumbers(c1,c2);
		c4.print();
		c1.print();
		c2.print();
		
	}

}
