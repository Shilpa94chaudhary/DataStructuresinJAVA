package StackAssignment;

public class StockSpan {
	
	
//	public static int[] stockSpan(int[] price) {
//		if(price.length == 0) {
//			return null;
//		}
//		int result[] = new int[price.length];
//		
//		result[0]=1;
//		for(int i=1; i<price.length ; i++) {
//			int count = 1;
//			for(int j=0; j<i ; j++) {
//				if(price[i]>price[j]) {
//					count++;
//				}else {
//					count = 1;
//				}
//			}
//			result[i]=count;
//		}
//		return result;
//		
//	}
	
	
	public static int[] stockSpan(int[] price) {
		int S[] = new int[price.length];
        // Span value of first day is always 1
        S[0] = 1;
  
        // Calculate span value of remaining days by linearly checking
        // previous days
        for (int i = 1; i < price.length; i++) {
            S[i] = 1; // Initialize span value
  
            // Traverse left while the next element on left is smaller
            // than price[i]
            for (int j = i - 1; (j >= 0) && (price[i] > price[j]); j--)
                S[i]++;
        }
        return S;
    }
	
	
	
	
	public static void main(String[] args) {
//		int[] price = {60, 70, 80, 100, 90, 75, 80, 120};
//		int result[] = stockSpan(price);

		
		int[] price = {60, 120, 80, 100, 90, 75, 80, 120};
		int result[] = stockSpan(price);
		
		
		for(int i=0; i<price.length ; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
