package uygulama3toString;

import java.util.ArrayList;

public class Ogrenci extends Kisi{

	private String okulNumarasi;
	private ArrayList<String> dersler;
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}
	public Ogrenci(String okulNumarasi, ArrayList<String> dersler) {
		this.okulNumarasi = okulNumarasi;
		this.dersler = dersler;
	}
	public Ogrenci(String adi, String soyadi, int dogumYili, String okulNumarasi, ArrayList<String> dersler) {
		super(adi, soyadi, dogumYili);
		this.okulNumarasi = okulNumarasi;
		this.dersler = dersler;
	}
	public String getOkulNumarasi() {
		return okulNumarasi;
	}
	public void setOkulNumarasi(String okulNumarasi) {
		this.okulNumarasi = okulNumarasi;
	}
	public ArrayList<String> getDersler() {
		return dersler;
	}
	public void setDersler(ArrayList<String> dersler) {
		this.dersler = dersler;
	}
	@Override
	public String toString() {
		return "Ogrenci [okulNumarasi=" + okulNumarasi + ", dersler=" + dersler + ", Adi()=" + getAdi()
				+ ", Soyadi()=" + getSoyadi() + ", DogumYili()=" + getDogumYili() + "]";
	}
	
	
	
}
