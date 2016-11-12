package app2;
class W extends Thread
{
	public void run()
	{
		for(int i =0;i<20;i++)
		{
			System.out.println(i);
			ThreadUtil.sleep(1000);
		}
	}
}
class X extends Thread
{
	public void run()
	{
		for(int i=0;i<120;i++)
		{
			System.out.println(i);
			ThreadUtil.sleep(2000);
		}
	}
}
public class Manager24
{
	public static void main(String[] args)
	{
		W w1 = new W();
		w1.start();
		X x1= new X();
		x1.start();
		for(int i=300;i<330;i++)
		{
			System.out.println(i);
			ThreadUtil.sleep(5000);
		}
	}

}
/*class ThreadUtil
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}*/