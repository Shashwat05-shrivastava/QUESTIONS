package linkedlist;

public class LinkedList {
	Node head;
	int size;
	
	//checking if empty
	public boolean isEmpty() {
		if(head==null)
			return true;
		else
			return false;
	}
	
	//For size
	public int getSize() {
		return size;
	}
	
	////////////Adding///////////////
	public void AddAtFirst(int val){
		Node n = new Node();
		n.setData(val);
		n.setNext(head);
		head=n;
		size++;
	}
	//////////////////////////////////
	public void AddAtLast(int val){
		Node n = new Node();
		n.setData(val);
		Node t=head;
		
		if(t==null)
			head=n;
		else {
			while(t.getNext()!=null) {
				t=t.getNext();
			}
			t.setNext(n);
		}
		size++;
	}
	////////////////////////////////////////
	public void AddAtPos(int val,int pos){
		Node n = new Node();
		n.setData(val);
		Node t=head;
		if(pos==1)
			AddAtFirst(val);
		else if(pos==size+1)
			AddAtLast(val);
		else if(pos>1 && pos<=size){
			for(int i=1;i<pos-1;i++) {
				t=t.getNext();
			}
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
		else {
			System.out.println("Invalid Position");
		}
			
		
	}
	
	/////////Deleting///////////
	public void DeleteAtFirst(){
		
		if(head==null)
		{
			System.out.println("List is Empty");
		}else {
			head=head.getNext();
			
		}
	}
	//////////////////////////////////////
	public void DeleteAtLast(){
		if(head==null)
			System.out.println("List is Empty");
		else if(size==1) {
			head=null;
			size--;
		}
		else {
			Node t=head;
			for(int i=1;i<size-1;i++) {
				t=t.getNext();	
			}
			t.setNext(null);
			size--;
		}
	}
	///////////////////////////////////////
	public void DeleteAtPos(int pos){
		Node t=head;
		Node t1;
		if(pos==1)
			DeleteAtFirst();
		else if(pos==size)
			DeleteAtLast();
		else if(pos>1 && pos<=size){
			for(int i=1;i<pos-1;i++) {
				t=t.getNext();
			}
			t1=t.getNext();
			t.setNext(t1);
			size--;
		}
			
	}
	
	//Displaying List
	public void view(){
		Node t;
		t=head;
		if(isEmpty())
			System.out.println("List is Empty.....");
		for(int i=1;i<=size;i++) {
			System.out.println(""+t.getData());
			t=t.getNext();
		}
	}
	
	//Detect Cycle
	public boolean Cycle(){
		Node slow=head;
		Node fast=head;
		while(slow!=null && fast!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}                              //1->2->3->4->5
		return false;                  
		
	}
	
	public Node reverse() {
		Node prev=null;
		Node next=null;
		Node curr=head;
		
		while(head!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
	   return prev;
	}
}
