package app2;
class J implements Runnable
{
	public void run()
	{
		
	}
}
public class Manager8
{
	public static void main(String[] args)
	{
		J j1 = new J();
		Thread t1= new Thread(j1);
		Thread t2  = new Thread(j1,"abc");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		/*System.out.println(t2.getId());
		System.out.println(t1.getId());
		System.out.println(t2.getPriority());*/
		System.out.println("<=======>");
		t1.setName("Thread1");
		t2.setName("Thread2");
		System.out.println(t1.getName());
		/*System.out.println(t2.getId());
		System.out.println(t1.getId());
		System.out.println(t2.getPriority());*/
		System.out.println(t2.getName());
	}
	

}
