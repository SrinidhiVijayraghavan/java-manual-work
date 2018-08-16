package exhandle;

public class ex9 {
	private int data=30;  
		 class Inner{  
		  void msg(){System.out.println("data is "+data);}  
		 }  
		 public static void main(String args[]){  
		  ex9 obj=new ex9();  
		 ex9.Inner in=obj.new Inner();  
		  in.msg();  
		 }  
		}  


