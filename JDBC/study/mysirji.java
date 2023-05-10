package study;
import java.lang.*;

public class mysirji {
	
	
public static void main(String[]args) {
	try {
		String s="7000";
		int v=Integer.parseInt(s);
		System.out.println(v);
	}
	catch(NumberFormatException e) {
		System.out.println("NumberFormatException occured");
	}
	
}
}