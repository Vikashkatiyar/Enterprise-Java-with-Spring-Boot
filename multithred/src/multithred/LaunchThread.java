/**
 * 
 */
package multithred;

/**
 * @author vikash katiyar
 *
 */
public class LaunchThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//getting the information of thread 
		Thread t=Thread.currentThread();
		System.out.println(t);
		
		
		//chnage the name and priority of thread and many more
		t.setName("vikash");
		t.setPriority(8);
		System.out.println(t);
		
		//perform unique operation using Thread class name it means 
		//curentThread() is static
		Thread.currentThread().setName("katiyar");
		System.out.println(t);
         		
	}

}
