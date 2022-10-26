package Stacks;

import java.util.Stack;

public class BracketsBalanced {

	public static boolean isBalanced(String expression) {
		if(expression == null) {
			return true;
		}
		Stack<Character> expressionStack = new Stack<Character>();
		for(int i = 0; i<expression.length(); i++) {
			if(expression.charAt(i) == '(') {
				expressionStack.push('(');
			}else {
				if(expressionStack.isEmpty()) {
					return false;
				}
				expressionStack.pop();
			}
		}
		return expressionStack.isEmpty();
    }
	
	public static void main(String[] args) {
		
		String expression = "";
		System.out.println(isBalanced(expression));

	}

}
