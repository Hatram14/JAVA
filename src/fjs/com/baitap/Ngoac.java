package fjs.com.baitap;

import java.util.Stack;

public class Ngoac {
 
	public static void main(String[] args) { 
	  System.out.println(Check(")("));
    }
	
	public static boolean Check(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) return false;
				char openPeek = stack.peek();
				if(c == ')' && openPeek=='(') {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
