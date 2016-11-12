package app1;
class N extends Thread
{
	N()
	{
		start();
	}
	public void run()
	{
		for(int i = 0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager17
{
	public static void main(String[] args)
	{
		N n1 = new N();
		n1.start();//we are trying to start second time so it will give exception
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
