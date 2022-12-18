
enum Results
{
	PASS, FAIL, NR;
	int marks;
	
	 Results()
	{
		System.out.println("Constructor is getting called");
	}
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	int getMarks()
	{
		return marks;
	}
}
public class LaunchEnums2 {

	public static void main(String[] args) {
		
		Results.PASS.setMarks(10);
		int marks=Results.PASS.getMarks();
		System.out.println(marks);
		

	}

}
