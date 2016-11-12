package app1;
class H extends Thread
{
	public void run()
	{
		for(int i = 0; i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager12
{
	public static void main(String[] args)
	{
		H h1 = new H();
		h1.start();
		System.out.println("**********");
		h1.start();/*it will give IllegalThreadStateException because we are trying to 
						restart*/
		System.out.println("done");
	}
}
