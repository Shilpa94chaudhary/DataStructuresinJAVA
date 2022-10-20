package OOPS3_Generics;


public class ChainGenericPair {

	public static void main(String[] args) {
		MultipleGenericPair<String, Integer> pInner = new MultipleGenericPair<>("Hello",100);
		
		// Chain pair
		MultipleGenericPair<MultipleGenericPair<String, Integer> , String> cPair = new MultipleGenericPair<>(pInner, "World");
		
		// This statement will print address of the inner pair pInner
		System.out.println(cPair.getFirst());
		
		// This statement will print first element of inner pair
		System.out.println(cPair.getFirst().getFirst());
		// This statement will print second element of inner pair
		System.out.println(cPair.getFirst().getSecond());
		
		// This statement will print second element of chained pair 
		System.out.println(cPair.getSecond());
		
		
		MultipleGenericPair<MultipleGenericPair<String, Integer> , String> cPair2 = new MultipleGenericPair<>();
		
		// This statement will print first element of chained pair 
		System.out.println(cPair2.getFirst());
				
		// This statement will print second element of chained pair 
		System.out.println(cPair2.getSecond());

	}

}
