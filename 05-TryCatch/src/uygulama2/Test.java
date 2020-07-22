package uygulama2;

public class Test {

	public static void main(String[] args) {
		Adress adress = new Adress("Vakif sokak", "Yeniþehir mah", "Karabük");
		
		Ogrenci ogrenci = new Ogrenci("Furkan", "Portakal", "123123", null);
		
		//ogrenci.setAdres(adress); //bunu acmassan hata alýrsýn.
		ogrenciBilgiYazdir(ogrenci);
		System.out.println("deneme");
	}
	
	public static void ogrenciBilgiYazdir(Ogrenci ogrenci) {
		
		try {
			System.out.println("Adi : "+ogrenci.getIsim());
			System.out.println("Soyadi : "+ogrenci.getSoyisim());
			System.out.println("Okul Numarasi : "+ogrenci.getOkulNumarasi());
			
			Adress adress1 = ogrenci.getAdres();
			System.out.println("Sokak : "+ adress1.getSokak());
			System.out.println("Mahalle : "+adress1.getMahalle());
			System.out.println("Sehir : "+adress1.getSehir());
		}catch (Exception e) {
			System.out.println("Hata : "+e);
		}
	}
}
