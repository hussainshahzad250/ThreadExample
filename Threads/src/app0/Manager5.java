package app0;
class A
{
	void test()
	{
		for(int i = 0;i<1000;i++)
		{
			System.out.println(i);
		}
		System.out.println("=== ===");
	}
}
public class Manager5
{
	public static void main(String[] args)
	{
		for(int j= 1000;j<=2000;j++)
		{
			System.out.println(j);
		}
		System.out.println("**********");
		
		A a1 =new A();
		a1.test();
		System.out.println("========");
		
		for(int i=3000; i<=4000;i++)
		{
			System.out.println(i);
		}
	}
}
