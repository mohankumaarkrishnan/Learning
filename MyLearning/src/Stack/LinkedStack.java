package Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedStack {
	
	private LinkedList<Integer> stack;
	
	public LinkedStack() {
		stack=new LinkedList<Integer>();
	}
	
	private void push(Integer value) {
		stack.push(value);
	}
	
	private Integer pop() {
		if(size()==0) {
			throw new EmptyStackException();
		}
		return stack.pop();
	}
	
	private Integer peek() {
		return stack.peek();
	}
	
	private Integer size() {
		return stack.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack stack= new LinkedStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
