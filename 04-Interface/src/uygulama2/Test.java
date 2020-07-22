package uygulama2;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Furkan", "Portakal",1999 , null);
		
		Adres adres1 = new Adres("Vakif","Yeniþehir","Karabük");
		ogrenci1.setAdres(adres1);
		ogrenci1.setOkulNumarasi("18360859046");

		ArrayList<String> dersler1 = new ArrayList<String>();
		dersler1.add("Matematik");
		dersler1.add("Fizik");
		dersler1.add("Kimya");
		ogrenci1.setDersler(dersler1);
		ArrayList<String> dersler2 = new ArrayList<String>();
		dersler2.add("Cografya");
		dersler2.add("Tarih");
		dersler2.add("Turkce");
		
		Adres adres2 = new Adres("Cýnar", "Meydan mah", "Bursa");
		Adres adres3 = new Adres("Aslan sokak","Kazim mah","Ýstanbul");
		
		Ogrenci ogrenci2 = new Ogrenci("Aliyar","Saglam", 1993,adres1,"1567562", dersler2);
		Ogrenci ogrenci3 = new Ogrenci("Furkan","Portakal", 1998,adres2,"5646546", dersler1);
		Ogretmen ogretmen1 = new Ogretmen("Hakan", "Yýlmaz", 1987, null);
		ogretmen1.setAdres(adres3);
		KisiIslemleriImpl kisiIslemleriImpl = new KisiIslemleriImpl();
		kisiIslemleriImpl.kisiyiKaydet(ogretmen1);
		kisiIslemleriImpl.kisiyiKaydet(ogrenci1);
		kisiIslemleriImpl.kisiyiKaydet(ogrenci2);
		kisiIslemleriImpl.kisiyiKaydet(ogrenci3);
		kisiIslemleriImpl.kisileriListele();
		OgrenciIslemleriImpl ogrenciIslemleriImpl = new OgrenciIslemleriImpl();
		ogrenciIslemleriImpl.ogrenciKaydet(ogrenci3);
		ogrenciIslemleriImpl.ogrenciKaydet(ogrenci2);
		ogrenciIslemleriImpl.ogrenciKaydet(ogrenci1);
		ogrenciIslemleriImpl.ogrenciListele();
		
	}
}
