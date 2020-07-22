package uygulama4;

public class Denetim extends Thread {

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(3000);
				System.out.println("Thread is sleep");
			} catch (InterruptedException e) {
				System.out.println("Hata : " + e);
			}
		}

	}

	public static void main(String[] args) {
		Denetim denetim = new Denetim();
		denetim.start();
		//uyuyan parcacýgý uyandýrýlýr.
		denetim.interrupt();
	}
}
