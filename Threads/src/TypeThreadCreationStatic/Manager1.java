package TypeThreadCreationStatic;

public class Manager1
{
	static class A implements Runnable
	{
		public void run()
		{
			System.out.println("done");
		}
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		Thread t1 = new Thread(a1);
		t1.start();
		System.out.println("laughing");
	}
}

