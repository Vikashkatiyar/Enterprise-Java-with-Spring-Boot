package multithred;


class Bathroom implements Runnable{
	public void run(){
		
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using bathroom");
             Thread.sleep(3000);
             System.out.println(Thread.currentThread().getName()+" exited the bathroom");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class LaunchB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bathroom b=new Bathroom();
       
       Thread t1=new Thread(b);
       Thread t2=new Thread(b);
       Thread t3=new Thread(b);
       
       
       t1.setName("BOY");
       t2.setName("GIRL");
       t3.setName("TIKTOKER");
       
       t1.start();
       t2.start();
       t3.start();
	}

}
