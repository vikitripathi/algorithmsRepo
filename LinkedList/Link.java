
public class Link {
	public String bookName;
	public int millionSold;
	//every object constructed from the Link Class will contain 
	//an instance variable next that will be used to  store null or a reference to another object from this class. 
	public Link next;
	public Link(String bookName,int millionSold){
		this.bookName=bookName;
		this.millionSold=millionSold;
	}
	public void display(){
		System.out.println(bookName+":"+millionSold+",000,000");
	}
	public String toString(){
		return bookName;
	}
	public static void main(String args[]){
		LinkList theLinkedList =new LinkList();
		theLinkedList.insertFirstLink("DOn 1", 500);
		theLinkedList.insertFirstLink("DOn 2", 600);
		theLinkedList.insertFirstLink("DOn 3", 700);
		theLinkedList.insertFirstLink("DOn 4", 800);
		
		theLinkedList.display();
		System.out.println("------------------------------------");
		theLinkedList.removeFirst();
		theLinkedList.display();
		System.out.println(theLinkedList.find("DOn 3").bookName + "was found ");
		theLinkedList.removeLink("DOn 3");
		System.out.println("------------------------------------");
		theLinkedList.display();
		
	}
}
class LinkList{
	//an instance variable next that will be used to  store null or a reference to another object from this class. 
	public Link firstLink;
	LinkList(){
		firstLink=null;
	}
	public boolean isEmpty(){
		return(firstLink==null);
	}
	public void insertFirstLink(String bookName,int millionSold){
		Link newLink=new Link(bookName,millionSold);
		newLink.next=firstLink;
		firstLink=newLink;
		
	}
	public Link removeFirst(){
		Link linkReference=firstLink;
		if(!isEmpty())
		{
			firstLink=firstLink.next;
		}
		else{
			System.out.println("Empty Linked List");
		}
		return linkReference;
	}
	public void display(){
		Link theLink=firstLink;
		while(theLink != null){
			theLink.display();
			System.out.println("Next Link:"+theLink.next);
			theLink=theLink.next;
			System.out.println();
			
		}
	}
	public Link find(String bookName){
		Link theLink=firstLink;
		if(!isEmpty()){
			while(theLink.bookName!=bookName){
				if(theLink.next==null){
					return null;
				}else{
					theLink=theLink.next;
				}
			}
		}
		else{
			System.out.println("Empty Linked List");
		}
		return theLink;
	}
	public Link removeLink(String bookName){
		Link currentLink=firstLink;
		Link previousLink=firstLink;
		while(currentLink.bookName != bookName){
			if(currentLink.next==null)
			{
				return null;
			}
			else{
				previousLink=currentLink;
				currentLink=currentLink.next;
			}
		}
		if(currentLink==firstLink){
			firstLink=firstLink.next;
		}
		else{
			previousLink.next=currentLink.next;
		}
		return currentLink;
		
	}
	
	
}

