package TypeThreadCreationStatic;
public class B implements Runnable
{
	public void run()
	{
		System.out.println("done");
	}
	public static void main(String[] args)
	{
		B b1 = new B();
		Thread t1 = new Thread(b1);
		t1.start();
	}
}
