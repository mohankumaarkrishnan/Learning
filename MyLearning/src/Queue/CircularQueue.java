package Queue;

import java.util.NoSuchElementException;

public class CircularQueue {

	
	private int[] queue;
	private int front;
	private int back;
	
	public CircularQueue(int capacity) {
		// TODO Auto-generated constructor stub
		queue=new int[capacity];
	}
	
	public void add(int value) {
		if(back==queue.length-1) {
			int numItems=size();
			int[] newQueue = new int[2*queue.length];
			System.arraycopy(queue, front, newQueue, 0, queue.length-front);
			System.arraycopy(queue, 0, newQueue, queue.length-front,back);
			queue=newQueue;
			front=0;
			back=numItems;
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
		if(size()==0) {
			front=0;
			back=0;
		}
		else if(front==queue.length) {
			front=0;
		}
		return value;
	}
	
	public int peek() {
		if(size()==0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	
	public int size() {
		if(front<=back) {
			return back-front;
		}
		else {
			return back-front+queue.length;
		}
		
	}
	
	public void printQueue() {
		if(front<=back) {
			for(int i=front;i<back;i++) {
				System.out.println(queue[i]);
			}
		}
		else {
			for(int i=front;i<queue.length;i++) {
				System.out.println(queue[i]);
			}
			for(int i=0;i<back;i++) {
				System.out.println(queue[i]);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue queue=new CircularQueue(4);
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.remove();
		queue.remove();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.remove();
		queue.remove();
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.printQueue();
	}

}
