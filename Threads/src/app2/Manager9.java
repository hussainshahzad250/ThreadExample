package app2;

public class Manager9
{
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		System.out.println("Priority before setting = "+ t1.getPriority());
		t1.setPriority(10);
		System.out.println();
		System.out.print("Priority after setting = " + t1.getPriority());
		
	}

}
// Default priority is 5