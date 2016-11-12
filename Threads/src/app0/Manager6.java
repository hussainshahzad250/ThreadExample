package app0;
class Thread1 extends Thread
{
	public void run()
	{
		for(int i =0; i<=1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager6
{
	public static void main(String[] args)
	{
		Thread1 t1= new Thread1();
		t1.start();
		t1.run();//we can call any number of time run() method but we can't call start() more than one
		t1.run();
		for(int i = 2000; i<=3000;i++)
		{
			System.out.println(i);
		}
	}
}
