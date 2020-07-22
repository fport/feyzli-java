package uygulama3;

//Belli kosula gore threadlarýn sona erdirilmesi
public class Islem {
	public static void main(String[] args) {
		Calisan calisan1 = new Calisan("Aylin", 3);
		Calisan calisan2 = new Calisan("Mehmet", 2);
		Calisan calisan3 = new Calisan("Mehtap", 5);
		
		calisan1.start();
		calisan2.start();
		calisan3.start();
		
		System.out.println("Threadler calismaya basladi.");
	}

}

class Calisan extends Thread {

	public String ad;
	public int isSayisi;

	public Calisan(String ad, int isSayisi) {
		super();
		this.ad = ad;
		this.isSayisi = isSayisi;
	}

	
	@Override
	public void run() {
		super.run();
		if(isSayisi ==0) {
			return;
		}
		for(int i=0; i<isSayisi ; i++) {
			System.out.println(ad+"-->"+i+" calisiyor.");
		}
	}

}