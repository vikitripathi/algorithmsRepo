
public class ex2 {
	 int id;  
	    String name;  
	    String city;  
	    ex2(){
	    	System.out.println("default constructor invoked");
	    }
	    ex2(int id,String name){  
	    this();//it is used to invoked current class constructor. 	
	    this.id = id;  
	    this.name = name;  
	    }  
	    ex2(int id,String name,String city){  
	    //  constructor chaining
	    //Call to this() must be the first statement in constructor. 	
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
	      
	    public static void main(String args[]){  
	    ex2 e1 = new ex2(111,"karan");  
        ex2 e2 = new ex2(222,"Aryan","delhi");  
	    e1.display();  
        e2.display();  
	   }  
}
/*output
 *default constructor invoked
  default constructor invoked
  111 karan null
  222 Aryan delhi

 */
