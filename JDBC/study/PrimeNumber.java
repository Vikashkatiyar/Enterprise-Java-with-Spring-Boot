package study;

import java.util.Scanner;

class Prime1{
	public void p1(int x,int y)
	{
		System.out.println("first method:-");
		for(int i=x;i<=y;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					 count++;
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
	}
	public void p2(int x,int y)
	{
		System.out.println("second method:-");
		int j;
		for(int i=x;i<=y;i++)
		{
			for(j=2;j<=i-1;j++)
			{
				if(i%j==0)
					break;
			}
			if(j==i)
				System.out.print(i+" ");
		}
		System.out.println();
		
	}
}

public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int x=0;
		int y=0;
		try {
			x=sc.nextInt();
			y=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("give only integer values :  "+ e );
		}
		Prime1 obj=new Prime1();
		obj.p1(x,y);
		obj.p2(x,y);
	}

}
