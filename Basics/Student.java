class Student{  
 int rollno;  
 String name;  
 String city;  
  
 Student(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
 public String toString(){
  //overriding the toString() method  else printing object give its memory location
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[]){  
   Student s1=new Student(101,"Raj","lucknow");  
   Student s2=new Student(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString() 
   /*
    * use of string buffer , which makes string mutable , they are thread-safe
    */
   StringBuffer sb=new StringBuffer("Hello ");  
   sb.append("Java");//now original string is changed  
     
   System.out.println(sb);//prints Hello Java  
 }  
}