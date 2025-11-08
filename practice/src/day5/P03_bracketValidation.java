package day5;

import java.util.*;

public class P03_bracketValidation {
	public static void main(String[] args) {

		
		Stack<Character> stack = new Stack<Character>();
		
		String str = "[[]][[[]]]";
		
		
		int flag = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '[') {
				stack.push(str.charAt(i));
			}
			else {
				if(!stack.isEmpty()) {
					stack.pop();
				}
				else{
					flag = 1;
					break;
				}
			}
			
		}
		if(flag == 1 || !stack.isEmpty() ) {
			System.out.println("Invalid");
		}
		else {
			System.out.println("valid");
		}
		

	}
}
