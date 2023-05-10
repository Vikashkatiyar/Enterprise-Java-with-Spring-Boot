package study;

import java.util.Scanner;

class Operation{
	 public void Op()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter two numbers :");
		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 System.out.println("enter a character/symbol: ");
		 char c=sc.next().charAt(0);
		 switch(c)
		 {
		 case '+' :
			 System.out.println("sum of x and y is : "+ (x+y));
		     break;
		 case '-':
			 System.out.println("substraction of x and y is : "+ (x-y));
			 break;
		default:
			System.out.println("Symbol does not match: ");
		 }
		 
		 
		 
	 }
	
}

public class TwoNumAChar {

	public static void main(String[] args) {
		Operation obj=new Operation();
		Scanner sc=new Scanner(System.in);
		do {
			obj.Op();
			System.out.println("enter true for continue or false for exit");
			//boolean bc=sc.nextBoolean();
		}while(sc.nextBoolean());
		

	}

}
