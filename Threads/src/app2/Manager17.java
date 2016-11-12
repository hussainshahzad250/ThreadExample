package app2;
class P extends Thread
{
	public void run()
	{
		System.out.println("something");
	}
}
public class Manager17
{
	public static void main(String[] args)
	{
		P p1 =new P();
		p1.start();
		p1.setDaemon(true); 
		//we can not change the status of child after starting(IllegalThreadStateException)
		System.out.println("done");
	}

}
