package collections.list;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<>();
		stack.add(100);
		stack.add(200);
		stack.add(300);
		stack.add(400);
		stack.push(500);
		
		//last in last out
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.elementAt(1));
		
	}

}
