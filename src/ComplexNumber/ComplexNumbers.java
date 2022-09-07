package ComplexNumber;

public class ComplexNumbers {

	private int real;
	private int imaginary;
	
	public ComplexNumbers(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public void print() {
		if(imaginary > 0 ) {
			System.out.println(real + " + i" + imaginary);
		}else if (imaginary < 0) {
			int i = imaginary * (-1);
			System.out.println(real + " - i" + i);
		}else {
			System.out.println(real);
		}
		
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public void addComplexNumbers(ComplexNumbers c) {
		this.real = this.real + c.real;
		this.imaginary = this.imaginary + c.imaginary;
	}
	
	public void multiplyComplexNumbers(ComplexNumbers c) {
		
		int real = (this.real * c.real) - (this.imaginary * c.imaginary);
		int imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
		this.real = real;
		this.imaginary = imaginary;
		
	}
	
	public static ComplexNumbers addComplexNumbers(ComplexNumbers c1, ComplexNumbers c2) {
		int real = c1.real + c2.real;
		int imaginary = c1.imaginary + c2.imaginary;
		ComplexNumbers c = new ComplexNumbers(real, imaginary);
		return c;
	}
	
	
}
