package uygulama3;

public class Test {
	
	public static void main(String[] args) {
		
		/*
		 * Ogrenci ogrenci1 = new Ogrenci("Furkan", "Portakal", 1999, "25647"); Ogrenci
		 * ogrenci2 = new Ogrenci("porti", "Portakal", 1855, "25847");
		 * 
		 * DosyaYazma dosyaYazma = new DosyaYazma();
		 * 
		 * dosyaYazma.dosyaOlustur("ogrenciler"); boolean dosyaOlusturmaDurumu =
		 * dosyaYazma.dosyaOlustur("ogrenciler"); if(dosyaOlusturmaDurumu) {
		 * System.out.println("Dosya basarili bir sekilde olusturuldu !"); } else {
		 * System.out.println("Dosya olusturulurken hata olustu !");}
		 * 
		 * 
		 * dosyaYazma.ogrenciyiKaydet(ogrenci1); dosyaYazma.ogrenciyiKaydet(ogrenci2);
		 * 
		 * 
		 * dosyaYazma.dosyaYazmayiKapat(); boolean dosyaYazmaKapanmaDurumu =
		 * dosyaYazma.dosyaYazmayiKapat(); if(dosyaYazmaKapanmaDurumu) {
		 * System.out.println("Dosya basarili bir sekilde olusturuldu !"); } else {
		 * System.out.println("Dosya olusturulurken hata olustu !");}
		 */
	
		DosyaOkuma dosyaOkuma = new DosyaOkuma();
		dosyaOkuma.okunacakDosyalar("ogrenciler");
        //dosyaOkuma.dosyaSatirOku();
		dosyaOkuma.dosyaKelimeOku();
		dosyaOkuma.dosyaOkumayiKapat();
	 
	}
}

