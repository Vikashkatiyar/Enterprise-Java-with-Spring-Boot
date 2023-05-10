package study;

public class varagsVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display obj=new display();//create a object
		obj.show(5,6,7,8,10,1,12,18);
		
		

	}

}
   class display {
	   public void show(int ...  a) {
		   for(int i:a)
		   System.out.print(i+" "  );
	   }
   }
