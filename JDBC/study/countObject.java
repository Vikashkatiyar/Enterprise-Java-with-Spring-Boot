package study;

public class countObject {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A obj1=new A();
		A obj2=new A();
		A obj10=new A();
		obj10.counter();

	}

}
class A{
	 static int i=0;
	public  A() {//because constructer will never return anything
		i++;
	}
	public void counter() {
		System.out.println(i);
	}
}
