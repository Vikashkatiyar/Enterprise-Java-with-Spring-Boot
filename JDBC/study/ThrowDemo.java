package study;

import java.util.Scanner;

class AgeNotValidException extends Exception
{

	
	
} 
public class ThrowDemo {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		int age=s.nextInt();
		if(age<18)
		{
			try 
			{
				 throw new AgeNotValidException();
			}
			catch(AgeNotValidException e)
			{
				System.out.println("not eligible for driving licence");
			}
			
		}
		else {
			System.out.println("you are eligible for licence");
		}
		
	}

}
