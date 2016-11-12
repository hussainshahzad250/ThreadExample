package app0; 
class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i =0;i<1000;i++)
		{
			System.out.println(i);
			
		}	
	}
}
public class Manager7
{
	public static void main(String[] args)
	{
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		
		System.out.println("**********");
		for(int i = 2000;i<3000;i++)
		{
			System.out.println(i);
		}
	}
}
