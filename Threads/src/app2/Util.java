package app2;
class Util
{
	static void getProperties()
	{
		Thread t1 = Thread.currentThread();
		System.out.println("Id = "+t1.getId());
		System.out.println("name = "+t1.getName());
		System.out.println("priority= "+t1.getPriority());
		System.out.println("status = "+t1.isDaemon());		
		System.out.println("******");
	}
}

//this class used in Manager4