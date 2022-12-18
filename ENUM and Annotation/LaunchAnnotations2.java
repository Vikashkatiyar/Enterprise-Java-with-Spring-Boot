import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	String gameName() ;//default "Cricket";
	int runs();// default 20000;
	
}
//@ specifies compiler that annotation type is being created

@CricketPlayer(gameName="CrciketPlayer", runs=2000)
class Virat
{
	private String name;
	private int age;
	
	
	public void disp()
	{
		System.out.println("Virat is Indian");
	}	
}
public class LaunchAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Virat v=new Virat();
		v.disp();
		Class c=v.getClass();
		Annotation a=c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp=(CricketPlayer)a;
		System.out.println(cp.gameName());
		System.out.println(cp.runs());
		      

	}

}
