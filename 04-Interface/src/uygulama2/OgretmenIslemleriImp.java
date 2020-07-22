package uygulama2;

import java.util.ArrayList;

public class OgretmenIslemleriImp implements OgretmenIslemleri {

	private ArrayList<Ogretmen> ogretmenler = new ArrayList<Ogretmen>();
	
	@Override
	public boolean ogretmenKaydet(Ogretmen ogretmen) {

		return ogretmenler.add(ogretmen);
	}

	@Override
	public boolean ogretmenSil(Ogretmen ogretmen) {
		// TODO Auto-generated method stub
		return ogretmenler.remove(ogretmen);
	}

	@Override
	public void ogretmeniGoster(Ogretmen ogretmen) {
		System.out.println(ogretmen);
		// toString calýsýyor
	}
	
}
