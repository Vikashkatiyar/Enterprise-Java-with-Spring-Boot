package study;
import java.util.Scanner;



public class printUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
       
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of i is:");
        int i=in.nextInt();//input by user
        System.out.println("enter the value of j is:");
        
        
        int j=in.nextInt();//input by user
       int  k=i+j;
        
        
      System.out.println("the addition of "+i+" and "+j+" is "+k);
      System.out.printf("the additio of %d and %d is %d ",i,j,k );
	}

}
