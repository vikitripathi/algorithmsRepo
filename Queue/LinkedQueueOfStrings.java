
public class LinkedQueueOfStrings
{
private Node first, last;
private class Node
{
	//access modifier doesn't matter
			String item;//instance variables have a default value
			Node next;  //object , a reference to another node
			public String toString(){
				return item ;
			}	
}

public boolean isEmpty()
{ return first == null;
}
public void enqueue(String item)
{
Node oldlast = last;
last = new Node();
last.item = item;
last.next = null;
if (isEmpty()) first = last;
else
oldlast.next = last;
}
public String dequeue()
{
String item = first.item;
first
= first.next;
if (isEmpty()) last = null;
return item;
}
public static void main(String[] args ){
	LinkedQueueOfStrings l=new LinkedQueueOfStrings();
//	System.out.println(l.first);	
//	System.out.println("====");	
	String s="hello";
	l.enqueue(s);	
	System.out.println("===");
	System.out.println(l.first);
	System.out.println("===");
	String sa="hello2";
	l.enqueue(sa);
	System.out.println("===");
	System.out.println(l.first);
	System.out.println("===");
	String sab="hello3";
	l.enqueue(sab);
	System.out.println("=====");
	System.out.println(l.dequeue());
	System.out.println(l.first);
	System.out.println(l.first.next);
}
}