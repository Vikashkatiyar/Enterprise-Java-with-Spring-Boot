package study;
import java.util.*;


public class randomNumberPrint
{

	public static void main(String[] args)
	{
		Random r=new Random();
		int a[]=new int[10];
		for( int i=0;i<a.length;i++)
			a[i]=r.nextInt(50);
		for(int i:a)//enhanced for loop
			System.out.println(i);
	
		
		
    }
}
