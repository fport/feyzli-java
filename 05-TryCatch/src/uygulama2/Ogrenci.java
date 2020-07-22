package uygulama2;

public class Ogrenci {
	
	private String isim;
	private String soyisim;
	private String okulNumarasi;
	private Adress adres;
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}
	public Ogrenci(String isim, String soyisim, String okulNumarasi, Adress adres) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.okulNumarasi = okulNumarasi;
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
	public String getOkulNumarasi() {
		return okulNumarasi;
	}
	public void setOkulNumarasi(String okulNumarasi) {
		this.okulNumarasi = okulNumarasi;
	}
	public Adress getAdres() {
		return adres;
	}
	public void setAdres(Adress adres) {
		this.adres = adres;
	}
	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", soyisim=" + soyisim + ", okulNumarasi=" + okulNumarasi + ", adres=" + adres
				+ "]";
	}
	
	
}
