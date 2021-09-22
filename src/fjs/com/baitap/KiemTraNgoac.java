package fjs.com.baitap;

import java.util.Stack;

public class KiemTraNgoac {
    
	public static void main(String[] args) {
		System.out.println(isValid("()(()"));
	}
	
	public static boolean isValid(String s) {
		//tạo stack kiểu character
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i<s.length();i++) {
			//mỗi phần tử của mảng s
			char c = s.charAt(i);
			//kiểm tra dấu mở ngoặc
			if(c=='(' || c=='{' || c=='[') {
				//xếp vào trong stack
				stack.push(c);
			}else {
				//Các trường hợp còn lại là dấu đóng ngoặc
				//Trong khi nó là dấu đóng ngoặc ta sẽ kiểm tra đỉnh
				if(stack.isEmpty()) return false;
				//Lấy stack trên đỉnh
				char openPeek = stack.peek();
				if((c == ')' && openPeek == '(') 
					|| (c == '}' && openPeek == '{')
					|| (c == ']' && openPeek == '[')) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
