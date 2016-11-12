package app2;
class S1 extends Thread
{
	public void run()
	{
		for(int i =0;i<3000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager20
{
	public static void main(String[] args)
	{
		S1 s1 = new S1();
		s1.start();
		try
		{
			s1.join();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
