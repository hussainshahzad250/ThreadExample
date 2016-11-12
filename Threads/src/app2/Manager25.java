package app2;
class Y extends Thread

{
	public void run()
	{
		for(int i =0;i<3000;i++)
		{
			System.out.println(i + " : " + isInterrupted());//isInterrupted return type is boolean
		}
	}
}
public class Manager25
{
	public static void main(String[] args)
	{
		Y y1= new Y();
		y1.start();
		ThreadUtil.sleep(1);
		y1.interrupt();
		System.out.println("done");
	}

}
