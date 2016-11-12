package InterThreadCommunication3;
class A
{
	synchronized void test1()
	{
		System.out.println("tesst1 begin");
		try
		{
			wait();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("test1 end");
	}
	synchronized void test2()
	{
		notify();
	}
}
class Thread1 extends Thread
{
	A a1;
	Thread1(A a1)
	{
		this.a1 = a1;
	}
	public void run()
	{
		a1.test1();
	}
}
class Thread2 extends Thread
{
	A a1;
	public Thread2(A a1)
	{
		this.a1 = a1;
	}
	public void run()
	{
		a1.test1();
	}
}
public class Manager
{
	public static void main(String[] args)
	{
		A a1 = new A();
		Thread1 t1 = new Thread1(a1);
		Thread2 t2 = new Thread2(a1);
		t1.start();
		t2.start();
		try
		{
			Thread.sleep(20000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("about to release");
		A a2 = new A();
		a1.test2();
	}
}
