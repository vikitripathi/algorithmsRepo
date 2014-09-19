//example of this keyword 
public class ex1 {
	int id;  
    String name;  
      
    ex1(int id,String name){  
    this.id = id;  
    this.name = name;  
    }  
    void display(){System.out.println(id+" "+name);}  
    public static void main(String args[]){  
    ex1 s1 = new ex1(111,"Karan");  
    ex1 s2 = new ex1(222,"Aryan");  
    s1.display();  
    s2.display();  
}
}
/*parameter (formal arguments) and instance variables
 *  are same that is why we are using this keyword to distinguish 
 *  between local variable and instance variable.  */
