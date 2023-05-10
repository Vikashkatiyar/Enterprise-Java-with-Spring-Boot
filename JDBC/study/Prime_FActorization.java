package study;

import java.util.Scanner;

public class Prime_FActorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("factorization of given value n: ");
       for(int fac=2;fac<=(n)&&(n!=1);fac=fac+1)
       {
    	   while(n%fac==0)
    	   {
    		   n=n/fac;//reduce n
    		   System.out.println(fac);
    		   if(n==1)
    			   break;
    	   }
       }
       
	}

}
