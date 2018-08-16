package exhandle;

public class ex10 {
		abstract class Person{  
			  abstract void eat();  
			}  
			class ex10{  
			 public static void main(String args[]){  
			  Person p=new Person(){  
			  void eat(){System.out.println("nice fruits");}  
			  };  
			  p.eat();  
			 }  
			}  



