package TypeThreadCreationLocal;

public class Manager1
{
	public static void main(String[] args)
	{
		class B implements Runnable
		{
			public void run()
			{
				for(int i=0;i<=100;i++)
				{
					System.out.println(i);
				}
			}
		}
		B b1 = new B();
		Thread t1 = new Thread(b1);
		t1.start();
		
	}
}
