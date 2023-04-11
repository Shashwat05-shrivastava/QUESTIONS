package linkedlist;

public class Node {
	int data;
	Node next;
	
	public Node() {
		data=0;
		next=null;
	}
	
	public Node(int d, Node n) {
		data=d;
		next=n;
	}
	public void setData(int d) {
		this.data=d;
	}
	public void setNext(Node n) {
		this.next=n;
	}
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
}
