package app2;
class A extends Thread
{
	public void run()
	{
		System.out.println("done");
	}
}
public class Manager1
{
	public static void main(String[] args)
	{
		A a1 =new A();
		System.out.println("default properties are------>>");
		/*long id = a1.getId();String name = a1.getName();int priority = a1.getPriority();
		 * boolean Daemon status = a1.isDaemon();System.out.println("ID= " + id);System.out.println("Thread Name= "+name);* System.out.println("Priority = " + priority);System.out.println("Daemon Status = " + Daemonstatus);*/		
		System.out.println("ID of Thread  = " + a1.getId());
		System.out.println("NAME of Thread  = " + a1.getName());
		System.out.println("PRIORITY of Thread  = " + a1.getPriority());
		System.out.println("STATUS of Thread  = " + a1.isDaemon());
		a1.start();
		
	}

}
