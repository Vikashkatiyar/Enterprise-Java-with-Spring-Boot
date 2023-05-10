package study;

import java.util.Scanner;

class FinallyDemo 
{
	public int sum() {
		int x=0;
		int y=0;
		int su=0;
		System.out.println("enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		try {
			x=sc.nextInt();
			y=sc.nextInt();
		   su=x+y;
		}
		catch(Exception e)
		{
			System.out.println("only no are allowed");
		}
		finally {
			return su;
		}
	}
}

public class Finally {

	public static void main(String[] args) 
	{
		FinallyDemo obj=new FinallyDemo();
		System.out.println(obj.sum());
		
		// TODO Auto-generated method stub

	}

}
