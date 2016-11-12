package app1;
class L extends Thread
{
	public void run()
	{
		System.out.println("begin");
		start();
		System.out.println("end");
	}
}
public class Manager15
{
	public static void main(String[] args)
	{
		L obj = new L();
		obj.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
