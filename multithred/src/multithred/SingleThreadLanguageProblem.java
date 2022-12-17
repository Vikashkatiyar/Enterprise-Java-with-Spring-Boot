package multithred;


class Demo1{
	public void banking(){
		System.out.println("Banking task started.");
		for(int i=0;i<3;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Banking......");
			
		}
		System.out.println("Banking Task Done.");
	}
}

class Demo2{
	public void printing(){
		System.out.println("printing task started.");
		for(int i=0;i<3;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing......");
			
		}
		System.out.println("Printing Task Done.");
	}
}


class Demo3{
	public void calculation(){
		System.out.println("calculation task started.");
		for(int i=0;i<3;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("calculating......");
			
		}
		System.out.println("calculation Task Done.");
	}
}

public class SingleThreadLanguageProblem {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		
		d1.banking(); 
		
		d2.printing();
		d3.calculation();
		
//		PROBLEM IN SINGLE THREADED LANGUAGE
		/*whenever banking is not completed printing is not going to run whatever time is wasted 
		in run the banking application
		
		Here CPU time is highly wasting
		
		 so multithreading comes into picture*/
	}

}
