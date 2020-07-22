package uygulama8;

public class AcikBolge {
	private int elma_sayisi;
	private boolean ordaMýsýn;

	public synchronized int elma_tuket() {
		while (ordaMýsýn == false) {
			try {
				wait();
			} catch (Exception e) {
			}

		}
		ordaMýsýn = false;
		notifyAll();
		return elma_sayisi;
	}

	public synchronized void elma_uret(int uretilenElma) {
		while (ordaMýsýn == true) {
			try {
				wait();
			} catch (Exception e) {
			}

		}
		elma_sayisi = uretilenElma;
		ordaMýsýn = true;
		notifyAll();

	}
}

class Uretici extends Thread {
	public AcikBolge t;

	public Uretici(AcikBolge t) {
		this.t = t;
	}

	@Override
	public synchronized void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			t.elma_uret(i);
			System.out.println("Üretici-Üretilen Elma Sayýsý=" + i + " kg.");
		}
	}

}

class Tuketici extends Thread {
	public AcikBolge t;

	public Tuketici(AcikBolge t) {
		this.t = t;
	}

	@Override
	public void run() {
		super.run();
		int alinan_elma = 0;
		for (int i = 0; i < 10; i++) {
			alinan_elma = t.elma_tuket();
			System.out.println("Tüketici-Tüketilen Elma Sayýsý=" + i + " kg.");
		}
	}

}