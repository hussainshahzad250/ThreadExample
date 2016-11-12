package app2;
class I extends Thread
{
	I(String name)
	{
		super(name);
	}
	I()
	{
	}
}
public class Manager7
{
	public static void main(String[] args)
	{
		I i1 = new I();
		I i2 = new I();
		System.out.println("Initial Name of Chlid Thread");
		System.out.println("Name of i1 thread = " +i1.getName());
		System.out.println("Name of i2 thread = " +i2.getName());
		System.out.println("++++++++++");
		System.out.println("++++++++++");
		i1.setName("hello");
		i2.setName("world");
		System.out.println("After setting name of child Thread");
		System.out.println("Name of i1 thread = " +i1.getName());
		System.out.println("Name of i2 thread = " +i2.getName());
	}

}
