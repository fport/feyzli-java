package uygulama1;

public class Daire implements Sekil{

	private final double PI = 3.14;
	private double r;
	
	public Daire() {
		// TODO Auto-generated constructor stub
	}
	
	public Daire(double r) {
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override

	public double alanHesapla() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}

	@Override

	public double cevreHesapla() {
		// TODO Auto-generated method stub
		return 2*PI*r;
	}
	
}
