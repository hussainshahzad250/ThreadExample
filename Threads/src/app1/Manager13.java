package app1;
class I extends Thread
{
	public void run()
	{
		int i = 10/0;//it will give Exception 
		System.out.println("end of the child");
	}
}
public class Manager13
{
	public static void main(String[] args)
	{
		I obj = new I();
		obj.start();
		for(int i = 10;i<20;i++)
		{
			System.out.println(i);
		}
	}
}
