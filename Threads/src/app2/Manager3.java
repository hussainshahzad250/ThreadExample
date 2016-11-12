package app2;
public class Manager3
{
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		System.out.println("Id = " + t1.getId());
		System.out.println("Thread Name = " + t1.getName());
		System.out.println("Priority = " + t1.getPriority());
		System.out.println("Daemon-Status = " + t1.isDaemon());
	}
}
