//java doesn't allow generic array
//avoid casting, it shows weakness
//generic implementation
//handling multiple type of data 
// maintain pointer to first node and remove/add from front.
// Stack<Integer> stack = new Stack<Integer>();
public class Stack<Item> {
	private Node first=null;//inner class variables as stack ?? check
	// for queues use another variable too , last 
	
//	public LinkedStackOfStrings(){
//		Node n=new Node();
//		System.out.println(n.item+"--");
//	}
	//inner class
	//should not have static members
	//inner class has extra overhead of 8 bytes
	private class Node{
		//access modifier doesn't matter
		Item item;//instance variables have a default value
		Node next;  //object , a reference to another node
//		public String toString(){
//			return item ;
//		}
	}
	public boolean isEmpty(){
		return first==null;
	}
	
	public void push(Item item){
		Node oldfirst=first;
//		System.out.println(first);
		first=new Node();//object 16 bytes overhead
		first.item=item;// 8 bytes reference to string 		
		first.next=oldfirst;// 8 bytes reference to node (so 40 bytes per stack node)
		System.out.println(first.item);
		System.out.println(first.next);
//		System.out.println(first + "===========");
	}
	public Item pop(){
		Item item=first.item;
		first=first.next;// first node is deleted is reclaimed by the garbage collector
		return item;
	}
	public static void main(String[] args ){
		Stack l=new Stack();
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
