package TypeAnnonymusInnerClass;

public class Manager1
{
	public static void main(String[] args)
	{
		Runnable r1 = new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					System.out.println(i);
				}				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		System.out.println("done");
	}
}
