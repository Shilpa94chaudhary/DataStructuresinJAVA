package RecursionAssignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GeometricSum {

	public static double findGeometricSum(int k){
		if(k<=0) {
			return 1;
		}
		double result = 1/(Math.pow(2,k));
		result += findGeometricSum(k-1);
		return result;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
	
}