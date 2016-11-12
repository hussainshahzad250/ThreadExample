package app1;

class M extends Thread {
	M() {
		start();
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

public class Manager16 {
	public static void main(String[] args) {
		M m1 = new M();
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);
		}
	}
}
