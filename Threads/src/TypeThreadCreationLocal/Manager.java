package TypeThreadCreationLocal;

public class Manager
{
	public static void main(String[] args)
	{
		class A extends Thread
		{
			public void run()
			{
				for(int i=0;i<100;i++)
				{
					System.out.println(i);
				}
			}
		}
		A a1 = new A();
		a1.start();
		System.out.println("submit successfully");
	}
}
