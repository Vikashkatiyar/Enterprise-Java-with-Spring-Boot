package study;
import java.util.Scanner;

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
             show obj=new show(n);
	}

}
class show
{
   public show()
   {
	   System.out.println("vikash katiytaer");
   }
   public show(int i)
   {
	   System.out.println("single parametric constructor");
   }
   public show(int i,double j)
   {
	   System.out.println("double parametric constructor");
   }
}
