/*
 *  OOP
 *  can pass the this keyword in the constructor also.
 *  It is useful if we have to use one object in multiple classes
 */
public class A4{  
	  int data=10;  
	  A4(){  
	   ex3 b=new ex3(this);  
	   b.display();  
	  }  
	  public static void main(String args[]){  
	   A4 a = new A4();  
	  }  
	}  
class ex3 {
	 A4 obj;  
	  ex3(A4 obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  
}
