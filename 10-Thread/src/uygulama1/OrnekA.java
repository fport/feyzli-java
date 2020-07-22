package uygulama1;

public class OrnekA {

	public static void main(String[] args) {
		Gorevli gorevli1 = new Gorevli("Gorevli-A");
		Gorevli gorevli2 = new Gorevli("Gorevli-B");
		
		gorevli1.start();
		gorevli2.start();
		
		System.out.println("Threadler calismaya basladi.");
	
	}
}

class Gorevli extends Thread {
	public String isim;

	public Gorevli(String isim) {
		this.isim = isim;
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 3; i++) {
			System.out.println(isim + " --> " + i + " calisiyor.");
		}
	}

}