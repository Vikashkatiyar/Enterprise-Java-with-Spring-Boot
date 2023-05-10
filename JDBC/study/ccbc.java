package study;

import java.util.Scanner;

public class ccbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
/*int div=1;
while(div*div<=n)
{
	System.out.println(div*div);
	div++;
}*/
for(int div=1;div*div<=n;div++)
{
	System.out.println(div*div);
}
	}

}
