package ExceptionHandling;

public class ExceptionThrown2 {

	public static void main(String[] args){

		/* NOTE:
		 * The ‘try’ block should be followed by either a ‘catch’ 
		 * block or a ‘finally’ block.
		 */
		
//		try{
//			return;
//		}
//		finally{
//			System.out.println("Hello World");
//		}
		
		
		/*
		 * This code will give Compile time error
		 * as the Arithmetic Exception is already handled in Exception catch
		 * so Arithmetic Exception caught will never execute
		 */
		
//		 try{
//		       int a = 5/0;
//		    }
//		    catch(Exception e){
//		        System.out.print("Exception caught ");
//		    }
//		    catch(ArithmeticException e){
//		        System.out.print("Arithmetic Exception caught ");
//		   }
//		   finally{
//		       System.out.print("finally block");
//		   } 
		
		try{
			@SuppressWarnings("unused")
			int a = 5/0;
		}catch(ArithmeticException e){
			System.out.print("Arithmetic Exception caught ");
		}
		catch(Exception e){
			System.out.print("Exception caught ");
		}
		finally{
			System.out.print("finally block");
		} 
	}
}
