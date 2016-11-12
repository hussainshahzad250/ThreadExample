package app2;

public class Manager22a
{
	public static void main(String[] args)
	{
		for(int i = 0;i<20; i++)
		{
				System.out.println(i);
				try
				{
					Thread.sleep(1000);// 1000 milli second = 1 second
				}
				catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
		}
	}
}

