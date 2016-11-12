package app2;
class P1 extends Thread
{
	public void run()
	{
		for(int i =0;i<3000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager18
{
	public static void main(String[] args)
	{
		P1 r1 = new P1();
		r1.start();
		System.out.println("done");
	}
}
