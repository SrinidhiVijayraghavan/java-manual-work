package java1;

class bike {
	int speed=50;  
		}  
		  
		public class  java34 extends bike{  
		  int speed=100;  
		      
		  void display(){  
		   System.out.println(super.speed);//will print speed of Vehicle now  
		  }  
		  public static void main(String args[]){  
	   java34 b=new java34();  
		   b.display();  
		     
	}  

}
