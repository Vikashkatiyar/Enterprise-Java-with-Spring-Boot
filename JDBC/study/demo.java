package study;
public class demo {

	public static void main(String[] args)
	{
		int i=0;
		try {
			
		    i=5/0;
		}
		catch(Exception e){
			System.out.println(i);
		System.out.println(e+" ");
		
		}
		int j=10;
		int x=j/0;
		System.out.println(x);
	}

}
