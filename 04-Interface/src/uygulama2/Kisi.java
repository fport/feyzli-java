package uygulama2;

public abstract class Kisi {
	
	private String isim;
	
	private String soyisim;
	
	private int dogumYili;
	
	private Adres adres;

	public Kisi() {
		// TODO Auto-generated constructor stub
	}

	public Kisi(String isim, String soyisim, int dogumYili, Adres adres) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.dogumYili = dogumYili;
		this.adres = adres;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Kisi [isim=" + isim + ", soyisim=" + soyisim + ", dogumYili=" + dogumYili + ", adres=" + adres + "]";
	}
	
	
}
