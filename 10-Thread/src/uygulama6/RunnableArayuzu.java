package uygulama6;

public class RunnableArayuzu {

	public static void main(String[] args) {
		Profesor p1 = new Profesor("Zapci");
		Thread t1 = new Thread(p1);
		t1.start();
		p1.calis();
	}
	
}

class OgretimUyesi implements Runnable {
	public String isim;
	public OgretimUyesi(String isim) {
		super();
		this.isim = isim;
	}
	@Override
	public void run() {
		try {

			for (int i = 0; i < 5; i++) {
				System.out.println("Profesor ders anlatýyor -->"+i);
			}
		} catch (Exception e) {
			System.out.println("Hata : +e");
		}
	}
}
class Profesor extends OgretimUyesi {

	public Profesor(String isim) {
		super(isim);
		// TODO Auto-generated constructor stub
	}
	void calis() {
System.out.println(isim+" gorevinin basinda");
	}
	
}