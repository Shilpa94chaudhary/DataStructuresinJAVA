package ExceptionHandling;

public class CustomException1 {
	/*
	 * In this class main will handle the exception
	 */
	
	/* 
	 * divide() function will throw the exception to main
	 * so the last statement to return a/b is not executed in case b=0
	 */
	
	public static int divide(int a, int b) throws DivideByZeroException {
		
		if(b==0) {
			throw new DivideByZeroException();
//			throw new ArithmeticException();
		}
		return a/b;
	}

	/* 
	 * main function will handle the exception, so the last statement to print "Back to Main"
	 * is executed
	 */
	
	public static void main(String[] args) {
		
		try {
			divide(10,5);
			System.out.println("divide(10,5): Divide By Zero Exception not raised");
		} catch (DivideByZeroException e) {
			System.out.println("divide(10,5): Divide By Zero Exception raised");
		}
		
		try {
			divide(10,0);
			System.out.println("divide(10,0): Divide By Zero Exception not raised");
		} catch (DivideByZeroException e) {
			System.out.println("divide(10,0): Divide By Zero Exception raised");
		}
		
		System.out.println("Back to Main");
	}
}
