package multithredingClass;

public class Thread1 extends Thread{
    
	public Thread1(String threadName) {
		// TODO Auto-generated constructor stub
		super(threadName);
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Inside Thread "+ Thread.currentThread().getName()+" "+i);
		}
	}
}