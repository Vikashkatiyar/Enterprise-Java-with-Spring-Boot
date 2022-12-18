
enum Result
{
	PASS, FAIL, NR;
}



public class LaunchEnums 
{
	enum Gender
	{
		MALE, FEMALE, OTHERS;
		
	}

	public static void main(String[] args) {
		
         Result r= Result.PASS;
         
         System.out.println(r);
         
         Gender g=Gender.MALE;
         System.out.println(g);
         int i=Gender.MALE.ordinal();
         System.out.println(i);

	}

}
