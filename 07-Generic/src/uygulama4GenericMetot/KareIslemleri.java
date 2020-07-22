package uygulama4GenericMetot;

public class KareIslemleri implements Islemler<Kare>{

	private Kare kare;
	public KareIslemleri() {
	}

	public KareIslemleri(Kare kare)
	{
		this.kare = kare;
	}
	
	@Override
	public double alanHesapla(Kare t) {
		double alan = t.getKenar()*t.getKenar();
		return alan;
	}

	@Override
	public double cevreHesapla(Kare t) {
		return t.getKenar()*4;
	}

	@Override
	public double alanHesapla() {
		return kare.getKenar()*kare.getKenar();
	}

	@Override
	public double cevreHesapla() {
		return kare.getKenar()*4;
	}

	

	
	
}
