import java.io.Serializable;
import java.rmi.*;
import java.rmi.server.*; 
public class AdditionServer implements Serializable {

	public static void main(String[] args) {
		
		 try {
			   Addition Hello = new Addition();			   		   
			   Naming.rebind("rmi://localhost/ABC", Hello);

			   System.out.println("Addition Server is ready.");
			   }catch (Exception e) {
				   System.out.println("Addition Server failed: " + e);
				}
	}

}
