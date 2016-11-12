package app0;

public class Mannager24
{
	public static void main(String[] args)
	{
		new Thread()
		{
			public void run()
			{
				for(int i = 0;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		}.start();
		for(int i = 1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}

}
