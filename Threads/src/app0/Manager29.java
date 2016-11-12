package app0;

public class Manager29
{
	static Thread getthThread()
	{
		return new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		});
	}
	public static void main(String[] args)
	{
		Thread t1 = new Thread();
		t1.start();
		getthThread().start();
		System.out.println("======");
		for(int i =1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
	
	
}
