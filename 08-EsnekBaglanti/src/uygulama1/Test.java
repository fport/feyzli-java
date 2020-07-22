package uygulama1;

public class Test {

	public static void main(String[] args) {
		
		Araba araba1 = new Araba("Mercedes","CLA180",5453,"kýrmýzý");
		Araba araba2 = new Araba("Sahin", "Tofas", 1989, "Beyaz");
		Araba araba3 = new Araba("HaciMurat", "bilinmiyor", 2500, "Sari");
		
		// Esnek Baglanti
		// Ýnterface olusturup karsýya onu ýmplement ettiðimiz classý yazýcaz
		// bu sekýlde ozellikleri guncellediðimizde kolaylýkla degýstýrebýlýrýz.
		ArabaIslemleri arabaIslemleri = new ArabaIslemleriImpl2();
		arabaIslemleri.arabaKaydet(araba1);
		arabaIslemleri.arabaKaydet(araba2);
		arabaIslemleri.arabaKaydet(araba3);

		arabaIslemleri.arabaListele();
		/*ArabaIslemleri arabaIslemleri = new ArabaIslemleriImpl();
		arabaIslemleri.arabaKaydet(araba1);
		arabaIslemleri.arabaKaydet(araba2);
		arabaIslemleri.arabaKaydet(araba3);

		arabaIslemleri.arabaListele();*/
		
		/**************************************************************/
		// Sert Baglantý
		/*ArabaIslemleriImpl arabaIslemleriImpl = new ArabaIslemleriImpl();
		arabaIslemleriImpl.arabaKaydet(araba1);
		arabaIslemleriImpl.arabaKaydet(araba2);
		arabaIslemleriImpl.arabaKaydet(araba3);
		
		arabaIslemleriImpl.arabaListele();
		ArabaIslemleriImpl2 arabaIslemleriImpl2 = new ArabaIslemleriImpl2();
		arabaIslemleriImpl2.arabaKaydet(araba1);
		arabaIslemleriImpl2.arabaKaydet(araba2);
		arabaIslemleriImpl2.arabaKaydet(araba3);
		
		arabaIslemleriImpl2.arabaListele();*/
		
		
		
	}
}
