package app2;

import java.util.Scanner;

class Counter extends Thread
{
	public void run()
	{
		int i=0;
		while(!isInterrupted())
		{
			i++;
			System.out.println(i);
			try
			{
				sleep(1000);
			}
			catch(InterruptedException ex)
			{
				break;
			}
		}
	}
}
public class Manager30
{
	public static void main(String[] args)
	{
		Counter c1 = new Counter();
		c1.start();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String decider=null;
		do
		{
			try
			{
				Thread.sleep(20000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("continue?(y/n)");
			decider=sc.next();
		}
		while("y".equals(decider));
			c1.interrupt();
			System.out.println("end of game");
	}
}