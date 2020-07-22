package uygulama11;

class ThreadA extends Thread {
	NesneA nesneA;

	public ThreadA(NesneA nesneA) {
		this.nesneA = nesneA;
	}

	@Override
	public void run() {
		super.run();
		try {
			nesneA.metodB();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class ThreadB extends Thread {
	NesneA nesneA;

	public ThreadB(NesneA nesneA) {
		this.nesneA = nesneA;
	}

	@Override
	public void run() {
		super.run();
		try {
			nesneA.metodA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class NesneA {
	Object keyA = new Object();
	Object keyB = new Object();

	public void metodA() throws InterruptedException {
		synchronized (keyA) {
			Thread.sleep(10);
			synchronized (keyB) {
				System.out.println("Nesne A ve metod A'yý " + Thread.currentThread().getName() + " adýyla tanýmladý.");
			}

		}
	}

	public void metodB() throws InterruptedException {
		synchronized (keyB) {
			Thread.sleep(10);
			synchronized (keyA) {
				System.out.println("Nesne A ve metod B'yi " + Thread.currentThread().getName() + " adýyla tanýmladý.");
			}
		}
	}
}

public class Kilit {
	public static void main(String[] args) {
		NesneA nesneA = new NesneA();
		ThreadA t1 = new ThreadA(nesneA);
		ThreadB t2 = new ThreadB(nesneA);
		t1.start();
		t2.start();

	}

}
