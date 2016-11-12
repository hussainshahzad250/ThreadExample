package app0;

public class Mannager25
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable()
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
		t1.start();
		System.out.println("second loop");
		for(int i = 1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
