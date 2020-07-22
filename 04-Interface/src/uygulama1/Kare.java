package uygulama1;

public class Kare implements Sekil{
	private double kenar;
	
	public Kare() {
		// TODO Auto-generated constructor stub
	}
	
	public Kare(double kenar) {
		this.kenar = kenar;
	}

	
	public double getKenar() {
		return kenar;
	}

	public void setKenar(double kenar) {
		this.kenar = kenar;
	}

	
	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return kenar*kenar;
	}

	@Override
	public double cevreHesapla() {
		// TODO Auto-generated method stub
		return kenar*4;
	}
	
}
