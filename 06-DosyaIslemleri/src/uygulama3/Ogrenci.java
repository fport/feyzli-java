package uygulama3;

public class Ogrenci {
	
	private String adi;
	private String soyadi;
	private int dogumYili;
	private String okulNumarasi;
	
	public Ogrenci() {
		this.adi = "";
		this.soyadi ="";
		this.dogumYili = 0;
		this.okulNumarasi = "";
		
	}

	public Ogrenci(String adi, String soyadi, int dogumYili, String okulNumarasi) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.dogumYili = dogumYili;
		this.okulNumarasi = okulNumarasi;
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

	public String getOkulNumarasi() {
		return okulNumarasi;
	}

	public void setOkulNumarasi(String okulNumarasi) {
		this.okulNumarasi = okulNumarasi;
	}

	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", soyadi=" + soyadi + ", dogumYili=" + dogumYili + ", okulNumarasi="
				+ okulNumarasi + "]";
	}

	

}
