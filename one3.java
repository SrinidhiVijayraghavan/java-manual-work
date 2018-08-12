package man;

public class one3 {
	

		int add(int x,int y)
		{
			int sum;
			sum=x+y;
			return sum;
		}
		int add(int x,int y,int z) 
		{
			int sum;
			sum=x+y+z;
			return sum;
		}
		
		public static void main(String[] args) {
			one3 s1=new one3();
			int a=s1.add(10,12);
			System.out.println("sum with two arguments"+a);
			int b=s1.add(10,12,20);
			System.out.println("sum with two arguments"+b);
		}
			

	}

