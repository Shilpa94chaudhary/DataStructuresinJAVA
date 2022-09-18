package PolynomialClass;

public class Polynomials {
	
	private int polynomial[];
	private int highestDegree;

	public Polynomials() {
		polynomial = new int[1];
		highestDegree = 0;
	}
	
	public void setCoefficient(int degree, int coefficient) {
		if(degree>highestDegree) {
			createPolynomial(degree+1);
			highestDegree = degree;
		}
		polynomial[degree] = coefficient;
		
	}

	private void createPolynomial(int size) {
		int temp[] = polynomial;
		polynomial = new int[size];
		for(int i = 0 ; i<temp.length ; i++) {
			polynomial[i] = temp[i];
		}
	}

	public void print() {
		for(int i = 0 ; i < polynomial.length ; i++) {
			if(polynomial[i]==0) {
				continue;
			}else {
				System.out.print(polynomial[i] + "x^" + i + " + ");
			}
		}
		System.out.println();
	}

	public void add(Polynomials p2) {
		if(this.highestDegree < p2.highestDegree) {
			int size = p2.highestDegree+1;
			createPolynomial(size);
			highestDegree = size;
		}
		for(int i = 0 ; i <= p2.highestDegree ; i++) {
			this.polynomial[i] += p2.polynomial[i];
		}
	}

	public void multiply(Polynomials p1) {
		if(this.highestDegree == 0 && p1.highestDegree == 0) {
			this.polynomial[0] = this.polynomial[0]*p1.polynomial[0];
		}else if(this.highestDegree == 0){
			
		}
	}

	public static Polynomials add(Polynomials p1, Polynomials p2) {
		
		return null;
	}

}
