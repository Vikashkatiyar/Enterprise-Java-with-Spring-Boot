package study;

class Mythread extends Thread 
{
	public void run()
	{
		for(int i=0;i<=10;i++)
			System.out.println(i);
		//System.out.println("hello");
		
	}
}

public class Multithreading {

	public static void main(String[] args)
	{
		
		Thread th=new Mythread();
		Thread th1=new Mythread();
		//Thread is pre defined class that has Start,run(blank method) method 
		//th.start();//thread coming to " Threadpool" by writting this line
	    //th1.start();
	    th.run();
	    th1.run();
	}

}
