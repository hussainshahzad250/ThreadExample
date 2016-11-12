package app0;
class D extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager9
{
	public static void main(String[] args)
	{
		D d1 = new D();
		d1.start();
		D d2 = new D();// both object are different , both are child thread and
						//both are indipendent of each other
						// both d1 and d2 allocating to execute run() method
		d2.start();
		System.out.println("done");
	}
}
/*Note : any no of child thread can be created
and no thread can start more than one.
*/