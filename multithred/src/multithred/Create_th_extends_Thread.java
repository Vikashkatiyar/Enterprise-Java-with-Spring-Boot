package multithred;


class Dem1 extends Thread{
	public void run(){
		printing();
	}
	public void printing(){
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

class Dem2 extends Thread{
	public void run(){
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


class Dem3 extends Thread{
	public void run(){
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
public class Create_th_extends_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dem1 d1=new Dem1();
		Dem2 d2=new Dem2();
		Dem3 d3=new Dem3();
		
		d1.start();
		d2.start();
		d3.start();
		
		/*Here Start method calls internally run() 
		Basically Start() assign the threads to Thread Schedular
		after that TS decide to give the permission of running the method */
	}

}
