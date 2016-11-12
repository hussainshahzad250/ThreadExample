package app2;
class K extends Thread{
}
public class Manager10
{
	public static void main(String[] args)
	{
		K k1 = new K();
		System.out.println(k1.getPriority());
		Thread t1 = Thread.currentThread();
		t1.setPriority(10);
		K k2 = new K();
		System.out.println(k2.getPriority());
		
	}

}
