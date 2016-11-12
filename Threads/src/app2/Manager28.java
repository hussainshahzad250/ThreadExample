package app2;
class Thread2 extends Thread
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
public class Manager28
{
	public static void main(String[] args)
	{
		Thread2 t2 = new Thread2();
		t2.start();
		ThreadUtil.sleep(2000);
		t2.interrupt();
		System.out.println("done");
	}
}
