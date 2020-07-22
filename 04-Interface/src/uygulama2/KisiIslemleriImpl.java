package uygulama2;

import java.util.ArrayList;

public class KisiIslemleriImpl implements KisiIslemleri{

	private ArrayList<Kisi> kisiler = new ArrayList<Kisi>();
	
	
	@Override
	public boolean kisiyiSil(Kisi kisi) {
		
		boolean durum = kisiler.remove(kisi);
		
		return durum;
	}

	@Override
	public boolean kisiyiKaydet(Kisi kisi) {
		
		boolean durumu = kisiler.add(kisi);
		
		return durumu;
	}

	@Override
	public void kisiBilgileriGöster(Kisi kisi) {
		
		System.out.println("Adi : "+ kisi.getIsim() );
		System.out.println("Soyadi : "+kisi.getSoyisim());
		System.out.println("Dogum Yili : "+kisi.getDogumYili());
		
		Adres adres = kisi.getAdres();
		System.out.println("Sokak : "+ adres.getSokak());
		System.out.println("Mahalle : "+adres.getMahalle());
		System.out.println("Sehir : "+adres.getSehir());
	
	}

	@Override
	public void kisiAdresBilgileriniGoster(Kisi kisi) {
		Adres adres = kisi.getAdres();
		System.out.println(kisi.getIsim()+" adli kisinin adresi : ");
		System.out.println("Sokak : "+ adres.getSokak());
		System.out.println("Mahalle : "+adres.getMahalle());
		System.out.println("Sehir : "+adres.getSehir());
	}

	@Override
	public void kisileriListele() {

		for(Kisi kisi: kisiler) {
			System.out.println("Adi : "+ kisi.getIsim() );
			System.out.println("Soyadi : "+kisi.getSoyisim());
			System.out.println("Dogum Yili : "+kisi.getDogumYili());
			
			Adres adres = kisi.getAdres();
			System.out.println("Sokak : "+ adres.getSokak());
			System.out.println("Mahalle : "+adres.getMahalle());
			System.out.println("Sehir : "+adres.getSehir());
			System.out.println("*********************************");
	}
	}
}
