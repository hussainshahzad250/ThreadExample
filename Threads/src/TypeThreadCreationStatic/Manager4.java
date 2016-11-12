package TypeThreadCreationStatic;

public class Manager4
{
	static class G implements Runnable
	{
		public void run()
		{
			System.out.println("shahzad");
		}
	}
	static class H implements Runnable
	{
		public void run()
		{
			System.out.println("Hussain");
		}
	}
	public static void main(String[] args)
	{
		G g1 = new G();
		Thread t1 = new Thread(g1);
		t1.start();
		H h1 = new H();
		Thread t2 = new Thread(h1);
		t2.start();
	}
	
}
