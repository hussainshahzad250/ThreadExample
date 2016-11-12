package app0;

public class Mn
{
	static class A extends Thread
	{
		public void run()
		{
			for(int i=0;i<1000;i++)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.start();
		for(int i=2000;i<3000;i++)
		{
			System.out.println(i);
		}
	}
}
