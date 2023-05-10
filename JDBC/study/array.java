package study;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		//for(int i=0;i<5;i++)
		  //    System.out.print(a[i]+" ");
		//for(int i=0;i<=4;i++)
			//System.out.printf("%d ",a[i]);
		System.out.println(Arrays.toString(a)+ " ");
		System.out.println(a[3]);

	}

}
