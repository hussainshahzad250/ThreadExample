package InterThreadCommunication2;

import java.util.Scanner;

class A {
	synchronized void test1() {
		try {
			wait();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	synchronized void test2() {
		// notify();
		notifyAll();
	}
}

class B extends Thread {
	A obj;

	B(A obj) {
		this.obj = obj;
	}

	public void run() {
		System.out.println("B-run-begin");
		obj.test1();
		System.out.println("B-run-end");
	}
}

class C extends Thread {
	A obj;

	C(A obj) {
		this.obj = obj;
	}

	public void run() {
		System.out.println("C-run-begin");
		obj.test1();
		System.out.println("C-run-end");
	}
}

class D extends Thread {
	A obj;

	D(A obj) {
		this.obj = obj;
	}

	public void run() {
		System.out.println("D-run-begin");
		obj.test1();
		System.out.println("D-run-end");
	}
}

public class Manager {
	public static void main(String[] args) {
		


		Scanner sc = new Scanner(System.in);
		System.out.println("enter sentance");
		// String name = sc.nextLine();
		String name = "shahzad is my name";
		String[] s = name.split(" ");
		for (int k = 0; k < s.length; k++) {
//			StringBuffer sb = new StringBuffer(s[k]);
//			System.out.println(sb.reverse());
			String  name1= s[k];
			for (int i = 0, j = name1.length() - 1; i <= j; j--) {
				char c = name1.charAt(j);
				System.out.print(c);
			}
			System.out.print(" ");
		}

	
	}
}
