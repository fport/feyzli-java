package uygulama10;

public class Gorevli implements Runnable {

	private int sayi;

	public Gorevli(int sayi) {
		this.sayi = sayi;
	}

	@Override
	public void run() {
		try {
			System.out.println("Gorevli "+sayi+"calismaya basladi");
			Thread.sleep(1000);
			System.out.println("Gorevli"+sayi+" isini bitirdi.");
		} catch (Exception e) {
			System.err.println("Hata : " + e);
		}
	}

}
