package ExceptionHandling;

public class CustomException2 {
	/*
	 * In this class main will throw the exception to the compiler
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
	 * main function will throw the exception to compiler, so the last 
	 * statement to print "Back to Main"
	 * is not executed
	 */
	
	public static void main(String[] args) throws DivideByZeroException{
		
		int result;
		
		System.out.println("divide(10,5)");
		result = divide(10,5);
		System.out.println("Result:" + result);
		
		System.out.println("divide(10,0)");
		result = divide(10,0);
		System.out.println("Result:" + result);
		
		System.out.println("Back to Main");
	}
}
