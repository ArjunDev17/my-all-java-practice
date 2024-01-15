class Node{
	Object e;
	Node next;
	public Node(Object e, Node next) {
		this.e = e;
		this.next = next;
	}
	
	public Node(Object e) {
		this.e = e;
	}
	
}
class LinkedList{
	private Node first=null;
	int count =0;
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			return;
		}
		Node curr=first;
	}
}
public class LinkedListOwnEmplimentatin {
	public static void main(String[] args) {

	}
}
