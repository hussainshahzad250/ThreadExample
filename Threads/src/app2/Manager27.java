package app2;
class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			sleep(10000);
		}
		catch(InterruptedException ex)
		{
			System.out.println("exception");
		}
		System.out.println(isInterrupted());
	}
}
public class Manager27
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		t1.start();
		System.out.println("done");
	}
}
