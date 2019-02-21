package stacksAndQueues2L;

import java.util.Stack;

public class StackUse {

	public static void reverseStack(Stack<Integer> stack1, Stack<Integer> stack2) throws StackEmptyException {
		
		if(stack1.isEmpty()) {
			return;
		}
		
		int topData = stack1.pop();
		
		while(!stack1.isEmpty()) {
			int data = stack1.pop();
			stack2.push(data);
		}
		
		reverseStack(stack2, stack1);
		
		stack1.push(topData);
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}

	}
	public static void main(String[] args) throws StackEmptyException {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		
		stack1.push(60);
		stack1.push(50);
		stack1.push(40);
		stack1.push(30);
		stack1.push(20);
		stack1.push(10); //top
		
//		while(!stack1.isEmpty()) {
//			System.out.println("Stack is not empty!");
//			System.out.println(stack1.pop());
//		}
		
		reverseStack(stack1, stack2);
		
		System.out.println(stack2.isEmpty());
		
		while(!stack1.isEmpty()) {
			System.out.println("Stack is not empty!");
			System.out.println(stack1.pop());
		}
	}
}
