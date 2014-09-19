
public class OuterClass {

private int privInt = 10;

//constructor
public OuterClass() {
     //creating object of inner class by outer class in the code
	 InnerClass inClass = new InnerClass();
	 inClass.accessOuter();
	 }

//an instance of inner class can access members of outer class even though they are private
 class InnerClass {  
  //inner class will not have any static member 
//	 public InnerClass(){
//		 System.out.println("the outer class private int is : "+ privInt);
//	 }
  public void accessOuter() {

  System.out.println("The outer class's privInt is (by second method) " + privInt);

  } 

 }
 
 public static void main(String[] args) {
	//create instance of outer class first:
	 OuterClass outClass = new OuterClass();
	 
	//OuterClass.InnerClass inner = outClass.new InnerClass(); 

	 //inner.accessOuter();
	}


}