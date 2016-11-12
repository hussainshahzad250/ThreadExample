package TypeThreadCreationStatic;

public class A extends Thread
{
	public void run()
	{
		System.out.println("done");
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.start();
		System.out.println("done successfully");
	}

}
