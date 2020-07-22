
package uygulama2;

public class OrnekB {
	public static void main(String[] args) {
		Gorevli gorevli1 = new Gorevli("Gorevli-1");
		Gorevli gorevli2 = new Gorevli("Gorevli-2");
		Gorevli gorevli3 = new Gorevli("Gorevli-3");
		// istedigimizi oncelikli belirleme
		gorevli1.setPriority(Thread.MIN_PRIORITY);
		gorevli2.setPriority(Thread.MIN_PRIORITY);
		gorevli3.setPriority(Thread.MAX_PRIORITY);

		gorevli1.start();
		gorevli2.start();
		gorevli3.start();
		System.out.println("Thread is running");
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
			System.out.println(isim + "-->"+this.getPriority() +" "+ i + " çalisiyor.");
		}
	}

}