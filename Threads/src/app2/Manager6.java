package app2;
class H extends Thread{	
}
public class Manager6
{
	public static void main(String[] args)
	{
		H h1 = new H();
		H h2 = new H();
		System.out.println("Id of h1 Thread= " + h1.getId());
		System.out.println("Name of h1 Thread = " + h1.getName());
		System.out.println("Priority of h1 Thread = " + h1.getPriority());
		System.out.println("Daemon Status Of h1 Thread = " + h1.isDaemon());
		System.out.println("***************");
		System.out.println("***************");
		System.out.println("Id of h2 Thread= " + h2.getId());
		System.out.println("Name of h2 Thread = " + h2.getName());
		System.out.println("Priority of h2 Thread = " + h2.getPriority());
		System.out.println("Daemon Status Of h2 Thread = " + h2.isDaemon());
		System.out.println("***************");
		System.out.println("***************");
		System.out.println("Name of Current Thread = " + Thread.currentThread().getName()); 
		System.out.println("**********");
		h1.setName("Hello");
		h2.setName("India");
		Thread.currentThread().setName("Initiator");
		System.out.println("After Changing all thread name is as follows");
		System.out.println("Name of h1 Thread = " +h1.getName());
		System.out.println("Name of h2 Thread = " + h2.getName());
		System.out.println("Name of Current Thread = "+Thread.currentThread().getName());
		System.out.print("this is another output= ");
		//Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread());
	}

}
