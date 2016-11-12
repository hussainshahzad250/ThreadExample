package app2;

public class Manager14
{
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		//IllegalThreadStateException(we can not change the status of main thread)
		System.out.println(t1.isDaemon());
	}
}
