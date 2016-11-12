package app2;
class L extends Thread
{
	public void run()
	{
		System.out.println();
		System.out.println(" Priority of L = " +getPriority());
	}
}
class M extends Thread
{
	public void run()
	{
		System.out.println();
		System.out.println(" Priority of M = " + getPriority());
		setPriority(8);
		L obj = new L();
		obj.start();
	}
}
public class Manager11
{
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		t1.setPriority(6);
		M m1 = new M();
		m1.start();
	}
}
