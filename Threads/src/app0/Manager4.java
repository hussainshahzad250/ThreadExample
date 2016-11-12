package app0;

public class Manager4
{
	public static void test()
	{
		System.out.println("from test");	
	}
	static void test1()
	{
		System.out.println("from test1");	
	}
	public static void main(String[] args)
	{
		System.out.println("main-begin");
		test();
		System.out.println("main-end");
		test1();
	}
}
