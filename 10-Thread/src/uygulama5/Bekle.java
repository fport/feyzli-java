package uygulama5;

/*
 * > 3 tip join methodu vardir.
 * 1- parametresiz join metodu --> join();
 * 2- parametreli join metodu --> join(millis);
 * 3- Parametreli join metodu --> join(millis,nanos);
 */
class Cihaz1 extends Thread {
	public int numara;

	public Cihaz1(int numara) {
		this.numara = numara;
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10000; i++) {
			System.out.println(numara + " numarali cihaz calisiyor --> " + i);
		}
	}
}
class Cihaz2 extends Thread {
	public int numara;

	public Cihaz2(int numara) {
		this.numara = numara;
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10000; i++) {
			System.out.println(numara + " numarali cihaz calisiyor --> " + i);
		}
	}
}

public class Bekle {
	
	public static void main(String[] args) throws InterruptedException {
		
		Cihaz1 c1 = new Cihaz1(1);
		Cihaz2 c2 = new Cihaz2(2);
	
		c1.start();
		/*
		 * c1.join();
		 */
		/*
		 * c1.join(1000);
		 * c1 500 ms bekleyip c2 baslýyor.
		 */
		c1.join(1000,500000);
		
		c2.start();
	}
	
}
























