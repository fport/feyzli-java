package uygulama2;

import java.util.ArrayList;

public class OgrenciIslemleriImpl implements OgrenciIslemleri{

	private ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
	
	@Override
	public boolean ogrenciKaydet(Ogrenci ogrenci) {
		return ogrenciler.add(ogrenci);
	}

	@Override
	public boolean ogrenciSil(Ogrenci ogrenci) {
		return ogrenciler.remove(ogrenci);
	}

	@Override
	public void ogrenciGoster(Ogrenci ogrenci) {
		System.out.println(ogrenci);
		// toString calýsýyor
	}

	@Override
	public void ogrenciListele() {
		for (Ogrenci ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
