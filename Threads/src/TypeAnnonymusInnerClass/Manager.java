package TypeAnnonymusInnerClass;

public class Manager
{
	public static void main(String[] args)throws Exception
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(i);
				}
			}
		};
		t1.start();
		t1.join();
		for(int i=20;i<40;i++)
		{
			System.out.println(i);
		}
	}
}
