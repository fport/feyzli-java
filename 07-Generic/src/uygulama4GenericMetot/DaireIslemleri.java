package uygulama4GenericMetot;

public class DaireIslemleri implements Islemler<Daire>{

	private Daire daire;
	
	public DaireIslemleri() {

	}
	public DaireIslemleri(Daire daire) {
		this.daire = daire;
	}

	@Override
	public double alanHesapla() {
		double alan = daire.getPI()*daire.getYariCap()*daire.getYariCap();
		return alan;
	}
	@Override
	public double cevreHesapla() {
		double cevre = 2*daire.getPI()*daire.getYariCap();
		return cevre;
	}
	
	@Override
	public double alanHesapla(Daire t) {
		double alan = t.getPI()*t.getYariCap()*t.getYariCap();
		return alan;
	}
	@Override
	public double cevreHesapla(Daire t) {
		double cevre = 2*t.getPI()*t.getYariCap();
		return cevre;
	}

	

	
}
