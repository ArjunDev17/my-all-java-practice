import java.util.LinkedList;
class OutOfRangeException extends RuntimeException
{
	}
class Node
{
	Object data;
	Node next;
	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node(Object data) {
		super();
		this.data = data;
	}
	 
  }
class LinkedList1
{
	Node head;
	int count=0;
	public void add(Object ele)
	{
		if(head==null)
		{
		  head=	new Node(ele);
		  count++;
		  return;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(ele);
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object get(int in)
	{
		if(in<0||in>=size()) throw new OutOfRangeException();
	     Node curr=head;
		for(int i=1;i<=in;i++)
		{
			curr=curr.next;
		}
		return curr.data;
	}
	public void remove(int in)
	{
		if(in<0||in>=size()) throw new OutOfRangeException();
		if(in==0)
		{
			head=head.next;
			count--;
			return;
		}
		Node curr=head;
		for(int i=1;i<in;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public void add(int in,Object ele)
	{
		if(in<0||in>=size()) throw new OutOfRangeException();
		if(in==0)
		{
			head=new Node(ele,head);
			count++;
			return;
		}
		Node curr=head;
		for(int i=1;i<in;i++)
		{
			curr=curr.next;
		}
		curr.next=new Node(ele,curr.next);
		count++;
	}
}
public class LinkListdemo {
	public static void main(String[] args) {
		LinkedList1 ll=new LinkedList1();
		ll.add(10);
		ll.add("dfghj");
		ll.add(30);
		ll.add(0, "raja");
		
		for(int i=0;i<ll.size();i++)
     	{
		System.out.println(ll.get(i));
    	}
		System.out.println("*************");
		System.out.println(ll.size());
		
	}


}