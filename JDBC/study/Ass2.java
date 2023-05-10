package study;
import java.util.Scanner;

class Op{
	public void task() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers: ");
		int x=0;
		int y=0;
		try {
			 x=sc.nextInt();
			 y=sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("here is the exception: "+ e);
		}
		if(x==y)
		{
			System.out.println("enter x>y or y>x only");
			System.exit(0);
		}
		else if(x>y)
			{
			int t=y;
			y=x;
			x=t;
			task1(x,y);
			}
		else if(x<y)
			task1(x,y);
		
	}
    public  void task1(int a,int b)		 
		 {
    	System.out.println("numbers are here: ");
    	     int flag=0;
			   for(int i=a;i<=b;i++)
			   {
				
				   if(i%3==0&&i%5==0) 
				   {
					   System.out.print(i+" ");
					   flag=1;
				   }       
			   }
			   if(flag==0)
				   System.out.println("does not have any number thanks!");  
		  }	
	}


public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Op obj=new Op();
       obj.task();
	}

}
