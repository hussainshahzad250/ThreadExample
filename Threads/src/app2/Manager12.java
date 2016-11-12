package app2;
class R extends Thread
{
	public void run()
	{
		System.out.println("L: " + getPriority());
	}
}
class S extends Thread
{
	public void run()
	{
		System.out.println("M: " + getPriority());
		setPriority(8);
		R obj = new R();
		obj.start();
	}
}
public class Manager12
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread().currentThread();
		t1.setPriority(6);
		M m1  = new M();
		m1.start();
	}	
}
