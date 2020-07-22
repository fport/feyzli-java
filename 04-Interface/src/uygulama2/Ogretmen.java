package uygulama2;

public class Ogretmen extends Kisi{
	
	private String brans;
	
	public Ogretmen() {
		// TODO Auto-generated constructor stub
	}

	public Ogretmen(String isim, String soyisim, int dogumYili, Adres adres) {
		super(isim, soyisim, dogumYili, adres);
	}

	public Ogretmen(String isim, String soyisim, int dogumYili, Adres adres, String brans) {
		super(isim, soyisim, dogumYili, adres);
		this.brans = brans;
	}

	public String getBrans() {
		return brans;
	}

	public void setBrans(String brans) {
		this.brans = brans;
	}

	@Override
	public String toString() {
		return "Ogretmen [brans=" + brans + ", getIsim()=" + getIsim() + ", Soyisim()=" + getSoyisim()
				+ ", DogumYili()=" + getDogumYili() + ", Adres()=" + getAdres() + "]";
	}
	
	
	
	
}
