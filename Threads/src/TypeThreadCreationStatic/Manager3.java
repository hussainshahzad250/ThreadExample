package TypeThreadCreationStatic;

public class Manager3
{
	static class E extends Thread
	{
		public void run()
		{
			System.out.println("doneeeeeeee");
		}
	}
	static class F extends Thread
	{
		public void run()
		{
			System.out.println("main shahzad hu");
		}
	}
	public static void main(String[] args)
	{
		E e1 = new E();
		e1.start();
		F f1 = new F();
		f1.start();
	}
}
