package TypeThreadCreationStatic;
class C extends Thread
{
	public void run()
	{
		System.out.println("done");
	}
}
class D implements Runnable
{
	public void run()
	{
		System.out.println("once more done");
	}
}
public class Manager
{
	public static void main(String[] args)
	{
		C c1 = new C();
		c1.start();
		D d1 = new D();
		Thread t1 = new Thread(d1);
		t1.start();
		System.out.println(" yahoo i got it");
	}
}
