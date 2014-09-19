// maintain pointer to first node and remove/add from front.
public class LinkedStackOfStrings {
	private Node first=null;//inner class variables as stack 
	
//	public LinkedStackOfStrings(){
//		Node n=new Node();
//		System.out.println(n.item+"--");
//	}
	//inner class
	//should not have static members
	private class Node{
		String item;//instance variables have a default value
		Node next;  //object
		public String toString(){
			return item ;
		}
	}
	public boolean isEmpty(){
		return first==null;
	}
	
	public void push(String item){
		Node oldfirst=first;
//		System.out.println(first);
		first=new Node();
		first.item=item;
		first.next=oldfirst;
		System.out.println(first.item);
		System.out.println(first.next);
//		System.out.println(first + "===========");
	}
//	public String pop(){
//		String item=first.item;
//		first=first.next;
//		return item;
//	}
	public static void main(String[] args ){
		LinkedStackOfStrings l=new LinkedStackOfStrings();
//		System.out.println(l.first);	
//		System.out.println("====");	
		String s="hello";
		l.push(s);	
		String sa="hello2";
		l.push(sa);
		String sab="hello3";
		l.push(sab);
	}
	
}
