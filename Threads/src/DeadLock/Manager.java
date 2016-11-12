package DeadLock;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class Shared
{
	synchronized void test1(Shared s)
	{
		System.out.println("test1 begin");
		Util.sleep(1000);
		s.test2(this);
		System.out.println("test1 end");
	}
	synchronized void test2(Shared s)
	{
		System.out.println("test2 begin");
		Util.sleep(1000);
		s.test1(this);
		System.out.println("test2 end");
	}
}
class A extends Thread
{
	Shared s1,s2;
	A(Shared s1,Shared s2)
	{
		this.s1= s1;
		this.s2= s2;
	}
	public void run()
	{
		s1.test1(s2);
	}
}
class B extends Thread
{
	Shared s1,s2;
	B(Shared s1,Shared s2)
	{
		this.s1= s1;
		this.s2= s2;
	}
	public void run()
	{
		s2.test2(s1);
	}
}
/*class Util
{
	static void sleep( long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}*/
public class Manager
{
	public static void main(String[] args)
	{
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		A a1 = new A(s1,s2);
		a1.start();
		B b1 = new B(s1,s2);
		b1.start();
		Util.sleep(10000);
		
		ThreadMXBean tx = ManagementFactory.getThreadMXBean();
		long ids[] = tx.findDeadlockedThreads();
		if(ids != null)
		{
			System.out.println("dead lock thread are ");
			ThreadInfo ti[] = tx.getThreadInfo(ids);
			ThreadInfo thInfo = null;
			for(int i = 0;i<ti.length;i++)
			{
				thInfo = ti[i];
				System.out.println(thInfo.getThreadId());
				System.out.println(thInfo.getThreadName());
				System.out.println(thInfo.getThreadState());
			}
		}
		else
		{
			System.out.println("no thread are under locked");
		}	
	}
}
