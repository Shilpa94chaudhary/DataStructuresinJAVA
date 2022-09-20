package PolynomialClass;

import java.util.Scanner;

public class Polynomialuse {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.print("Count of the number of coefficients in first polynomial: ");
		int n = s.nextInt();
		int degree1[] = new int[n];
		
		System.out.print("Enter degree in first polynomial: ");
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		
		System.out.print("Enter coefficients in first polynomial: ");
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		
		Polynomials first = new Polynomials();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		
		System.out.print("Count of the number of coefficients in second polynomial: ");
		n = s.nextInt();
		
		System.out.print("Enter degree in second polynomial: ");
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		
		System.out.print("Enter coefficients in second polynomial: ");
		int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		
		Polynomials second = new Polynomials();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		
		System.out.print("Enter choice : ");
		int choice = s.nextInt();
		Polynomials result;
		switch(choice){
		
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
			
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
			
		// Multiply
			/*
			 * (2x2 + 3x4) * (2x0 + 2x3 + 2x4)
			 * = 4x2 + 6x4 + 4x5 + 6x7 + 4x6 + 6x8
			 */
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}

}
