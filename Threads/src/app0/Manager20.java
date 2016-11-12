package app0;



public class Manager20
{
	public static void main(String[] args)
	{
		class A extends Thread
		{
			public void run()
			{
				for(int i =0;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		}
		A a1 = new A();
		a1.start();
		for(int i= 1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}


/*class Z extends Thread
{
	public void run()
	{
		for(int i =0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}

public class Manager20
{
	public static void main(String[] args)
	{
		Z a1 = new Z();
		a1.start();
		for(int i= 1000;i<2000;i++)
		{
			System.out.println(i);
		}
		
	}
}*/