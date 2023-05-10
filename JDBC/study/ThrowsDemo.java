package study;

class AgeNotValiException  extends Exception//if we use RuntimeException instead of Exception then throw keyword automatically throw the exception to the caller function
{//means unchecked exception automatically goes to caller function while checked exception does not have this type of feature
 //	in checked exception we use this type of "throws AgeNotValidException" syntax with the help of throws the it goes to automatically to caller function
}


 class Experiment// extends Exception 
 {
	public void a()throws AgeNotValiException
	{
		b();
	}
	public void b()throws AgeNotValiException 
	{
		//int x=2;
		//int y=0;
		//int z=x/y;
		System.out.print("Here is the excetion: ");
		throw new AgeNotValiException();
		
		
	}
}

public class ThrowsDemo {

	public static void main(String[] args) {
		Experiment obj =new Experiment();
		try {//here not mandatory to use try catch if we use throws then it not produce any error but it means u give exception directly to jvm		
			obj.a();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("hello");

	}

}
