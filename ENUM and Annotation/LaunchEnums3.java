
enum Gender
{
	MALE, FEMALE, OTHERS;
	
	//final static Gender MALE=new Gender();
}


public class LaunchEnums3 {

	public static void main(String[] args)
	{
		Gender g=Gender.MALE;
		System.out.println(g);

		
		Gender[] gr=Gender.FEMALE.values();
		
		for(Gender gg:gr)
		{
			System.out.println(gg + " " + gg.ordinal());
		}
		
	}

}
