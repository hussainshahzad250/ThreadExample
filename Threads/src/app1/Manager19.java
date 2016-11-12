package app1;

public class Manager19
{
	static class A implements Runnable
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
		Thread t1 = new Thread(a1);
		t1.start();
		for(int i=2000;i<3000;i++)
		{
			System.out.println(i);
		}
	}
}
