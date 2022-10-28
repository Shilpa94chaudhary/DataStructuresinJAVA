package StackAssignment;

import java.util.Stack;

public class MinimumBracketReversal {

	public static int countBracketReversals(String input) {
		if(input.length() %2 != 0){
			return -1;
		}else{
			Stack<Character> s = new Stack<>();
			int len = input.length();
			for (int i = 0; i < len; i++) {
				char c = input.charAt(i);
				if (c == '}' && !s.empty()) {
					if (s.peek() == '{')
						s.pop();
					else
						s.push(c);
				}
				else
					s.push(c);
			}
			int red_len = s.size();

			// count opening brackets at the end of
			// stack
			int n = 0;
			while (!s.empty() && s.peek() == '{') {
				s.pop();
				n++;
			}

			// return ceil(m/2) + ceil(n/2) which is
			// actually equal to (m+n)/2 + n%2 when
			// m+n is even.
			return (red_len / 2 + n % 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expr = "}}{{";
		System.out.println(countBracketReversals(expr));

	}

}
