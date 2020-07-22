package uygulama2;

public interface OgrenciIslemleri {
	
	public boolean ogrenciKaydet(Ogrenci ogrenci);
	
	public boolean ogrenciSil(Ogrenci ogrenci);
	
	public void ogrenciGoster(Ogrenci ogrenci);
	
	public void ogrenciListele();
}
