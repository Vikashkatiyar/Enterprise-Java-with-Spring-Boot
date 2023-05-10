package study;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int j=1;j<=t;j++){
	    int x=sc.nextInt();
	    int a[]=new int [x];
	    for(int i=0;i<=a.length;i++)
	       a[i]=sc.nextInt();
		Arrays.sort(a);
		int[] diff=new int[x];
            for (int i = 0; i < x-1; i++) {
                diff[i]=a[i+1]-a[i];
            }
            Arrays.sort(diff);
//            
            System.out.println(diff[1]);
	    }
	}
}