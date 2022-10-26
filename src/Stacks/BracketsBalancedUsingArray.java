package Stacks;

public class BracketsBalancedUsingArray {

	public static boolean isBalanced(String expression) {
		if(expression == null) {
			return true;
		}
		char exp[] = new char[expression.length()];
		int size = 0;
		for(int i = 0; i<expression.length(); i++) {
			if(expression.charAt(i) == '(') {
				exp[i] = expression.charAt(i);
				size++;
			}else {
				if(size == 0) {
					return false;
				}
				size--;
			}
		}
		return size==0;
	}
	public static void main(String[] args) {
		
		String expression = "()(())";
		System.out.println(isBalanced(expression));

	}

}
