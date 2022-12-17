package multithred;

class Warrier implements Runnable{
	String res1=new String("Brhmastra");
	String res2=new String("pashupatastra");
	String res3=new String("sarpastra");
	public void run(){
		try{
			String s1=Thread.currentThread().getName();
			if(s1.equals("Rama")){
				ramaAcqRes();
			}
			else{
				ravanaAcqRes();
			}
		}catch(Exception e){
			System.out.println("Some interuption");
		}
	}
	
	public void ramaAcqRes(){
		try{
			Thread.sleep(3000);
			synchronized(res1){
				System.out.println("Rama has acquires "+res1);
				Thread.sleep(3000);
				synchronized(res2){
					System.out.println("Rama has acquires "+ res2);
					Thread.sleep(3000);
					synchronized(res3){
						System.out.println("Rama has acquires "+res3);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void ravanaAcqRes(){
		try{
			Thread.sleep(3000);
			synchronized(res3){
				System.out.println("Ravana has acquires "+res1);
				Thread.sleep(3000);
				synchronized(res2){
					System.out.println("Ravana has acquires "+ res2);
					Thread.sleep(3000);
					synchronized(res1){
						System.out.println("Ravana has acquires "+res3);
					}
				}
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
public class LaunchDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Warrier w=new Warrier();
       
       Thread t1=new Thread(w);
       Thread t2=new Thread(w);
       
       t1.setName("Rama");
       t2.setName("Ravana");
       
       t1.start();
       t2.start();
       
       
	}

}
