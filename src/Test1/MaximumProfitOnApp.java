package Test1;

import java.util.Arrays;

public class MaximumProfitOnApp {

	public static int maximumProfit(int budget[]) {
		
		if (budget.length == 0) {
			return 0;
		}
		int maxProfit = budget[budget.length-1];
		int m = 1;
		Arrays.sort(budget);
		for (int i = budget.length - 2; i >=0 ; i-- ) {
			m++;
			if(maxProfit < m * budget[i]) {
				maxProfit = m * budget[i];
			}
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int budget[] = {34, 78, 90, 15, 67};
		System.out.println(maximumProfit(budget));
		
		
		int budget1[] = {30, 20, 53, 14};
		System.out.println(maximumProfit(budget1));
	}

}
