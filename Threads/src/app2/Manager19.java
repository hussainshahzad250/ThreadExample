package app2;
class R1 extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager19
{
	public static void main(String[] args)
	{
		R r1 = new R();
		r1.setDaemon(true);
		r1.start();
		System.out.println("done");
	}
}
