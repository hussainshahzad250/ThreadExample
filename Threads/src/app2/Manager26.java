package app2;
class Z extends Thread
{
	public void run()
	{
		for(int i = 0;i<3000;i++)
		{
			if(!isInterrupted())
			{
				System.out.println("something");
				//System.out.println(i+ " = something");
			}
			else
			{
				System.out.println("do others things");
				//System.out.println(i + " = do others things");
			}
		}
	}
}
public class Manager26
{
	public static void main(String[] args)
	{
		Z z1 = new Z();
		z1.start();
		ThreadUtil.sleep(5);
		z1.interrupt();
		System.out.println("doen");
	}

}
