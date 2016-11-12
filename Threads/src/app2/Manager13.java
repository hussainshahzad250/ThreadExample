package app2;

public class Manager13
{
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());
		t1.setPriority(11);//this will give IllegalArgumentException(bcoz priority is b/w 1-10)
		System.out.println(t1.getPriority());
	}	
}
