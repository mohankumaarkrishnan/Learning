package Stack;

import java.util.EmptyStackException;

public class ArrayStack {

	private Integer[] stack;
	private int top;
	private int size;
	
	
	public ArrayStack(int size) {
		this.size=size;
		stack=new Integer[size];
	}
	
	public void push(Integer value) {
		if(top==size) {
			Integer[] newArray=new Integer[2*size];
			System.arraycopy(stack, 0, newArray, 0, size);
			stack=newArray;
		}
		stack[top++]=value;
	}
	
	public Integer pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[--top];
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public int getSize() {
		return top;
	}
	
	public static void main(String[] args) {
		ArrayStack stack=new ArrayStack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.getSize());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
	
}
