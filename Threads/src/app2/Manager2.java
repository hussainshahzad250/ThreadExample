package app2;
class B extends Thread
{
}
class C extends Thread
{	
}
class D extends Thread
{	
}
class E implements Runnable
{
	public void run()
	{	
	}
}
public class Manager2
{
	public static void main(String[] args)
	{
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		E e1 = new E();
		Thread t1 = new Thread();
		Thread t2 = new Thread(e1);
		printProperties(b1);
		printProperties(c1);
		printProperties(d1);
		printProperties(t1);
		printProperties(t2);
	}
	/*static void printProperties(Thread t1)
	{
		System.out.println("ID = " + t1.getId());
		System.out.println("Name = " + t1.getName());
		System.out.println("Priority = " + t1.getPriority());
		System.out.println("Daemon-Status = " + t1.isDaemon());
		System.out.println();
	}*/
	static void printProperties(Thread t2)
	{
		System.out.println("Id=" + t2.getId() + " ");
		System.out.println("Name= " +t2.getName() + " ");
		System.out.println("Priority=" +t2.getPriority() + " ");
		System.out.println("Status=" + t2.isDaemon() + " ");
		System.out.println();
	}
}
/*System.out.println(b1.getId());System.out.println(c1.getId());System.out.println(d1.getId());
System.out.println(t1.getId());System.out.println(t2.getId());System.out.println(b1.getName());
System.out.println(c1.getName());System.out.println(d1.getName());System.out.println(t1.getName());
System.out.println(t2.getName());b1.setName("indian man");System.out.println(b1.getName());
}*/
