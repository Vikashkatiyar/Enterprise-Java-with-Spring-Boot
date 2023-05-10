package study;
import java.util.Scanner;
public class patterns {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value of n is: ");
		int n=in.nextInt();
		System.out.println("enter the value of m is: ");
		int m=in.nextInt();
		int i,j;
		System.out.println("pattern is this: ");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		
	    }

}
