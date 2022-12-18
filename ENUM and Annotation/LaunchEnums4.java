
enum Result1
{
	PASS, FAIL, NR;
	
	//public final static Result1 PASS=new Result1();
	/*
	 * Result1() { System.out.println("Lets how many times"); }
	 */
}


public class LaunchEnums4 {

	public static void main(String[] args) {
		Result1 r=Result1.FAIL;
		
		//Result1 rr=new Result1(); not possible
		switch(r)
		{
			case PASS: System.out.println("Passed");
			break;
			case FAIL: System.out.println("Failed");
			break;
			case NR: System.out.println("No result");
			break;
			
		}

	}

}
