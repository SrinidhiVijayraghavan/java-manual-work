package man;

class Vehicle{  
	void run(){System.out.println("Vehicle is running");}  
	}  
	class Vehicle extends Vehicle{  
	void run(){System.out.println("Bike is running safely");}  
	  
	public static void main(String args[]){  
	Exp29 obj = new Exp29();  
	obj.run();  
	}  
}

}
