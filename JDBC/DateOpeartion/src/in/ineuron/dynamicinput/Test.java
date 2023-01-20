package in.ineuron.dynamicinput;

public class Test {

	public static void main(String[] args) {

		java.util.Date uDate = new java.util.Date();
		System.out.println("UtilDate: "+uDate);

		long l = uDate.getTime();
	
		java.sql.Date sqlDate = new java.sql.Date(l);
		System.out.println("SQLDate : "+sqlDate);

	}

}
