package TypeThreadCreationStatic;

public class Manager5
{
	static class I extends Thread
	{
		public void run()
		{
			System.out.println("shahzad");
		}
	}
	static class J implements Runnable
	{
		public void run()
		{
			System.out.println("done");
		}
	}
	public static void main(String[] args)
	{
		I i1 = new I();
		i1.start();
		J j1 = new J();
		Thread t1 = new Thread(j1);
		t1.start();
	}
	
}
