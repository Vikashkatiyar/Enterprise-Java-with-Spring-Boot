package study;

import java.util.Scanner;

public class Gcd_Lcm {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
        int b=sc.nextInt();	
        int least =0;
        if(a<b)//always value of a is least
        {
        	
        }
        else
        {
        	int temp=b;
        	b=a;
        	a=temp;
        }
        //GCD(greatest coomom divisor) or Hcf
        for(int i=a;i>=1;i--) {
        	if(a%i==0&&b%i==0) {
        		System.out.println(i);
        		break;
        	}
        }
        
        
        
        //GCD METHOD 2
        /*
        int max=0;
        for(int i=1;i<=a;i++)
        {
        	if(a%i==0&&b%i==0&&i>max)
        		max=i;
        }
        System.out.println(max);*/
        
        
        
        
        
        //GCD METHOD 3(EUCLID METHOD )
        /*while(a!=0)
        {
        	int r=b%a;
        	b=a;
        	a=r;
        	
        }
        System.out.println(b);*/
        
        
        
        
        
        //LCM(GCD*LCM=A*B)lowest cooman multiple
        int j=1;
        while(j<=Integer.MAX_VALUE) {//Integer.MAX_value =10 ki powe 9 something that is like infinity
        	if((a*j)%b==0) {
        		 least=a*j;
        	System.out.println(least);
        	break;
        	
        }
        	j++;
        
       }
	}

}
