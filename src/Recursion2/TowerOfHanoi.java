package Recursion2;

import java.util.Scanner;

public class TowerOfHanoi {

	static Scanner s = new Scanner(System.in);

	public static void towerOfHanoi(int n, char s, char h, char d) {
		if(n<=0){
            return;
        }
		if(n==1) {
			System.out.println(s + " " + d);
			return;
		}
		towerOfHanoi(n-1, s, d, h);
		System.out.println(s + " " + d);
		towerOfHanoi(n-1, h, s, d);
	}
	
	/* 
	 * Input: 3
	 * Output:
	 * a c
	 * a b
	 * c b
	 * a c
	 * b a
	 * b c
	 * a c
	 */
	
	public static void main(String[] args) {
		int n = s.nextInt();
		towerOfHanoi(n, 'a', 'b', 'c');
	}
}