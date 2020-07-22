package uygulama4Map;

public class Ogrenci {

	private String adi;
	private String soyadi;
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}
	public Ogrenci(String adi, String soyadi) {
		this.adi = adi;
		this.soyadi = soyadi;
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
	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", soyadi=" + soyadi + "]";
	}

	
}
