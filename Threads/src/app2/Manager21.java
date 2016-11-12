package app2;
class T extends Thread
{
	public void run()
	{
		for(int i =0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class U extends Thread
{
	public void run()
	{
		for(int i =0;i<3000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager21
{
	public static void main(String[] args)
	{
		T t1 = new T();
		U u1 = new U();
		t1.start();
		u1.start();
		try
		{
			t1.join();
			u1.join();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
