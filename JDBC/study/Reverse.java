package study;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
		int rem=n%10;
		n=n/10;
		System.out.println(rem);
		}
		

	}

}
