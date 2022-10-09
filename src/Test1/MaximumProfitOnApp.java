package Test1;

import java.util.Arrays;

public class MaximumProfitOnApp {
	
	/*
	 * You have made a smartphone app and want to set its subscription price such 
	 * that the profit earned is maximised. There are certain users who will subscribe 
	 * to your app only if their budget is greater than or equal to your price.
	 * You will be provided with a list of size N having budgets of subscribers 
	 * and you need to return the maximum profit that you can earn.
	 * Lets say you decide that price of your app is Rs. x and there are N number 
	 * of subscribers. So maximum profit you can earn is :
	 *  m * x
	 *  where m is total number of subscribers whose budget is greater than or equal to x.
	 */

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
