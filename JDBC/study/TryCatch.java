package study;
import java.util.*;

public class TryCatch {
	public static void main(String[]args)
	{
		
		int count;
		do 
       {
		System.out.println("enter two numbers");
		int x=0;
		int y=0;
		 int flag=0;
		 count=0;
		 Scanner s=new Scanner(System.in);
		 
		try {
			x=s.nextInt();
			y=s.nextInt();
			
			flag=1;
			int z=x/y;
			System.out.println("division is: "+ z);
		}
		catch(ArithmeticException  e) {
			count=1;
			System.out.println("Denominator can't be zero");
		}
		catch(InputMismatchException e) {
			count=1;
			System.out.println("enter numbers only");
		}
		if(flag==1) {
		 System.out.println("sum is : "+ (x+y));
		}
		else
			System.out.println("sum can't be calculated");
		
	}while(count==1);
	}
}
