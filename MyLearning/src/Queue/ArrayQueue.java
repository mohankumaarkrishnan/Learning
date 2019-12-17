package Queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
	
	private int[] queue;
	private int front;
	private int back;
	
	public ArrayQueue(int capacity) {
		// TODO Auto-generated constructor stub
		queue=new int[capacity];
	}
	
	public void add(int value) {
		if(back==queue.length) {
			int[] newQueue = new int[2*queue.length];
			System.arraycopy(queue, 0, newQueue, 0, queue.length);
			queue=newQueue;
		}
		queue[back]=value;
		back++;
	}
	
	public int remove() {
		if(size()==0) {
			throw new NoSuchElementException();
		}
		int value=queue[front];
		queue[front]=0;
		front++;
		return value;
	}
	
	public int peek() {
		if(size()==0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	
	public int size() {
		return back-front;
	}
	
	
	public static void main(String[] args) {
		ArrayQueue queue=new ArrayQueue(5);
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(5);
	}
	
}
