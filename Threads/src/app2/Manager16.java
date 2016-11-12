package app2;
class B1 extends Thread
{
	public void run()
	{
		for(int i = 0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager16
{
	public static void main(String[] args)
	{
		B1 b1 = new B1();
		b1.setDaemon(true);//we can change the status of child before starting
		b1.start();
		System.out.println(b1.isDaemon());
		System.out.println("done");
	}
}
