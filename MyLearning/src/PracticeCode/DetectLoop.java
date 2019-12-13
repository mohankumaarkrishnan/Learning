package PracticeCode;

public class DetectLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> list=new LinkedListNode(10);
		LinkedListNode<Integer> list1=new LinkedListNode(20,list);
		LinkedListNode<Integer> list2=new LinkedListNode(30,list1);
		LinkedListNode<Integer> list3=new LinkedListNode(40,list2);
		//list.next=list2;
		
		detect(list3);
	}
	public static void detect(LinkedListNode<Integer> head) {
		
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
            System.out.println("has loop");
        }else {
        	System.out.println("no loop");
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
	public LinkedListNode(T data,LinkedListNode<T> next) {
		this.data = data;
		this.next = next;
	}
	
}
