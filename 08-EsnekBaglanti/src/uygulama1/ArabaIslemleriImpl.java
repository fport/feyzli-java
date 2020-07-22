package uygulama1;

public class ArabaIslemleriImpl implements ArabaIslemleri {

	@Override
	public void arabaBilgiYazdir(Araba araba) {

	System.out.println(araba);
	}

	@Override
	public boolean arabaKaydet(Araba araba) {

		boolean durum =arabalar.add(araba);
		return durum;
	}

	@Override
	public boolean arabaSil(Araba araba) {
		boolean durum = arabalar.remove(araba);
		return durum;
	}

	@Override
	public void arabaListele() {

		for(Araba araba : arabalar) {
			System.out.println(araba);
		}
		
	}

	
	
}
