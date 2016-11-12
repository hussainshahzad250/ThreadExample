package app0;


public class Manager31
{
	static Runnable getRunnable()
	{
		return new Runnable()
		{
			@Override
			public void run()
			{
				for(int i = 0;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		};
	}
	public static Thread getThread()
	{
		return new Thread(getRunnable());
	}
	public static  Thread getThread1()
	{
		return new Thread()
		{
			public void run()
			{
				for(int i =1000;i<2000;i++)
				{
					System.out.println(i);
				}
			}
		};
	}
	public static  Thread getThread2()
	{
		return new Thread()
		{
			public void run()
			{
				for(int i =1000;i<2000;i++)
				{
					System.out.println(i);
				}
			}
		};
	}
	public static void main(String[] args)
	{
		new Thread(getRunnable()).start();
		getThread().start();
		getThread1().start();
		getThread2().start();
		System.out.println("done");
	}
}