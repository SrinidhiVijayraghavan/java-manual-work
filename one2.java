package man;
import java.util.Scanner;
public class one2 {
int a,b,c;
void input() {
	System.out.println("enter values of a");
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	System.out.println("enter values of b");
	int b = in.nextInt();
}
void add() {
	System.out.println("result="+c);
}
	public static void main(String[] args) {
		one2 ad=new one2();
        ad.input();
        ad.add();
	}

}