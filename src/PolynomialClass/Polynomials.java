package PolynomialClass;

public class Polynomials {
	
	private int polynomial[];
	private int highestDegree;
	
	public Polynomials() {
		polynomial = new int[5];
		highestDegree = -1;
	}
	
	// This function will set the coefficient in a polynomial
	public void setCoefficient(int degree, int coefficient) {
		if(degree >= polynomial.length-1) {
			increaseSize(degree+1);
		}
		polynomial[degree] = coefficient;
		if(highestDegree < degree) {
			highestDegree = degree;
		}
	}
	
	// This function will increase the size of the 
	private void increaseSize(int size) {
		int temp[] = polynomial;
		polynomial = new int[size];
		for(int i = 0 ; i<temp.length ; i++) {
			polynomial[i] = temp[i];
		}
	}

	// This function will add two polynomials and return the result
	public Polynomials add(Polynomials second) {
		
		Polynomials result = new Polynomials();
		
		int i = 0, j = 0, k = 0;
		
		while( i<this.polynomial.length && j<second.polynomial.length) {
			result.setCoefficient(k, this.polynomial[i]+second.polynomial[j]);
			i++; j++; k++;
		}
		
		while(i<this.polynomial.length) {
			result.setCoefficient(k, this.polynomial[i]);
			i++; k++;
		}
		
		while(j<second.polynomial.length) {
			result.setCoefficient(k,second.polynomial[j]);
			j++; k++;
		}
		return result;
	}

	// This function will print the polynomial
	public void print() {
		for(int i=0; i<polynomial.length ; i++) {
			if(polynomial[i] != 0) {
				System.out.print(polynomial[i] + "x" + i + " ");
			}
		}
		
	}

	// This function will subtract second polynomial from first polynomial function called with
	public Polynomials subtract(Polynomials second) {
		
		Polynomials result = new Polynomials();
		
		int i = 0, j = 0, k = 0;
		
		while( i<this.polynomial.length && j<second.polynomial.length) {
			result.setCoefficient(k, this.polynomial[i]-second.polynomial[j]);
			i++; j++; k++;
		}
		
		while(i<this.polynomial.length) {
			result.setCoefficient(k, this.polynomial[i]);
			i++; k++;
		}
		
		while(j<second.polynomial.length) {
			result.setCoefficient(k, - second.polynomial[j]);
			j++; k++;
		}
		return result;
	}

	// This function will multiply the second polynomial to first polynomial
	/*
	 * (2x2 + 3x4) * (2x0 + 2x3 + 2x4)
	 * = 4x2 + 6x4 + 4x5 + 6x7 + 4x6 + 6x8
	 */
	public Polynomials multiply(Polynomials second) {
		Polynomials result = new Polynomials();
		
		int degree = highestDegree + second.highestDegree;
		result.setCoefficient(degree,0);
		
		for(int i = 0 ; i <= highestDegree ; i++) {
			for(int j = 0 ; j <= second.highestDegree ; j++) {
//				System.out.println("result.polynomial[i+j]"+ result.polynomial[i+j] + "polynomial[i]" + polynomial[i] + "second.polynomial[j]" + second.polynomial[j]);
				result.setCoefficient(i+j , result.polynomial[i+j] + polynomial[i]*second.polynomial[j]);
//				System.out.println("final value at: " + result.polynomial[i+j]);
			}
		}
		return result;
	}
}
