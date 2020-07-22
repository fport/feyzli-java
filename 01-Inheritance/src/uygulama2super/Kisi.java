package uygulama2super;

public class Kisi {
	private String adi;
	private  String soyadi;
	private int dogumYili;
	
	public Kisi() {
		// TODO Auto-generated constructor stub
	}

	public Kisi(String adi, String soyadi, int dogumYili) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.dogumYili = dogumYili;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}

	@Override
	public String toString() {
		return "Kisi [adi=" + adi + ", soyadi=" + soyadi + ", dogumYili=" + dogumYili + "]";
	}
}
