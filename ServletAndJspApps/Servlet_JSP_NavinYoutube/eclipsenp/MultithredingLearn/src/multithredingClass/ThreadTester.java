package multithredingClass;

public class ThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main is Starting");
		
		//from thread1-> extends
		Thread thread1 = new Thread1("thread1");
		thread1.start();
		
		//from thread2-> implements
		
		Thread thread2 = new Thread(new Thread2(),"thread2");
		thread2.start();
		
		
		
		System.out.println("Main is exiting");
	}

}

