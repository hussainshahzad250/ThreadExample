package app2;
class A1 extends Thread
{
	public void run()
	{
		for(int i =0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager15
{
	public static void main(String[] args)
	{
		A1 a1 = new A1();
		a1.start();
		System.out.println(a1.isDaemon());//by default child thread is user thread
		System.out.println("done ");
	}
}
