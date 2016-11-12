package app0;
class B extends Thread
{
	public void run()
	{
		for(int i = 0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i = 1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager8
{
	public static void main(String[] args)
	{
	
		B b1 = new B();
		b1.start();
		C c1 = new C();
		c1.start();
		for(int i = 2000;i<3000;i++)
		{
			System.out.println(i);
		}
	}
}
