package uygulama5;

public class Denetim extends Thread{

	public String isim;

	public Denetim(String isim) {
		this.isim = isim;
	}

	public static void main(String[] args) throws InterruptedException {
		Denetim g1 = new Denetim("Gorevli-1");
		Denetim g2 = new Denetim("Gorevli-2");
		Denetim g3 = new Denetim("Gorevli-3");
		g1.setPriority(Thread.MIN_PRIORITY);
		g2.setPriority(Thread.MAX_PRIORITY-2);
		g1.start();
		g2.start();
		//g3.start();
		//isAlive static bir method deeeldir. :D
		System.out.println("Gorevli-1 hayatta mi ? "+g1.isAlive());
		System.out.println("Gorevli-2 hayatta mi ? "+g2.isAlive());
		System.out.println("Gorevli-3 hayatta mi ? "+g3.isAlive());
		Thread.sleep(3000);
		
	}

	@Override
	public void run() {
		super.run();
		for(int i=0;i<=5;i++) {
			System.out.println(isim+"-->"+i);
			// ayný anda calýsmaya baslýyorlar.
			Thread.yield(); // this.yield();
			
		}
		
	}
	
	
}
