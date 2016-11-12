package app2;
class Thread3 extends Thread
{
	public void run()
	{
		ThreadUtil.sleep(1000);
		for(int i =0;i<5000;i++)
		{
			System.out.println(i+ ":" + isInterrupted());
		}
	}
}
public class Manager29
{
	public static void main(String[] args)
	{
		Thread3 t3 = new Thread3();
		t3.start();
		ThreadUtil.sleep(1100);
		t3.interrupt();
		System.out.println("done");
	}
}
