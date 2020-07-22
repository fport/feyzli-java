package uygulama2;

import java.util.ArrayList;

public interface KisiIslemleri {

	public boolean kisiyiSil(Kisi kisi);
	public boolean kisiyiKaydet(Kisi kisi);
	public void kisiBilgileriGöster(Kisi kisi);
	public void kisiAdresBilgileriniGoster(Kisi kisi);
	public void kisileriListele();
	
	
}
