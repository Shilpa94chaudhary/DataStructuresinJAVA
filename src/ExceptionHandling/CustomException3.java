package ExceptionHandling;

public class CustomException3 {

	public static int factorial(int num) throws NegativeNumberException{
		if (num<0) {
			throw new NegativeNumberException();
		}
		int fact = 1;
		for(int i = 2; i<=num ; i++) {
			fact *= i;
		}
		return fact;
	}

	public static int divide(int a, int b) throws DivideByZeroException{
		if(b==0) {
			throw new DivideByZeroException();
		}
		return a/b;
	}

	public static void main(String[] args) {

		try {
			
			factorial(0);
			
			divide(2,0);
			
			factorial(-2);
			
			divide(2,6);
			
		} catch (NegativeNumberException e) {
			
			System.out.println("Negative Number Exception thrown");
			
		} catch (DivideByZeroException e) {
			
			System.out.println("Divide By Zero Exception thrown");
			
		} catch (Exception e) {
			System.out.println("Generic Exception thrown");
		} finally {
			System.out.println("Finally");
		}
		
		/* 
		 * finally is going to execute whether try throws an exception or not
		 * Where we use finally, e.g. in networking if we establish a connection
		 * and some exception happens, and system throw an exception
		 * we have to remove the connection, 
		 * as finally will execute in every condition so we can disconnect the connections
		 * in finally
		 */
		
		
		System.out.println("Back to main");
		
	}

}
