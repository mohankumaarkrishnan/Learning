package PracticeCode;

public class DetectLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> list=new LinkedListNode(10);
	}
	public static void detect(LinkedListNode<Integer> head) {
		//Your Code Goes Here. No need to print the list, it has already been taken care.
        
        if(head==null||head.next==null){
            return;
        }
        
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        slow=slow.next;
        fast=fast.next.next;
       while(fast!=null&&fast.next!=null){
           if(slow==fast){
               break;
           }
           slow=slow.next;
           fast=fast.next.next;
       }
       
        if(slow==fast){
            slow=head;
            while(slow.next!=fast.next){
                slow=slow.next;
                fast=fast.next;
            }
            fast.next=null;
        }
	}
}
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}
