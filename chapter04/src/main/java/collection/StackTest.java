package collection;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		
		stack.push("Hello");
		stack.push("World");
		stack.push("!!!");
		stack.push("java");
		stack.push(".");
		
		while(!stack.isEmpty()) {
			String s = stack.pop();
			System.out.print(s+" ");
		}
		
		System.out.println("\n=============");
		
		stack.push("Hello");
		System.out.println(stack.pop());
		
		//stack.pop();		//Exception caused, because the stack is empty.
		
		System.out.println("=============");
		
		stack.push("duly");
		stack.push("micol");
		stack.push("douner");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek()); 		//See the top of stack. not delete.
		System.out.println(stack.size());
	}

}
