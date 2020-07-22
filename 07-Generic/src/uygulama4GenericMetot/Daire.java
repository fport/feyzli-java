package uygulama4GenericMetot;

public class Daire {

	private double yariCap;
	private final double PI = 3.14;
	
	public Daire() {
		// TODO Auto-generated constructor stub
	}
	
	public Daire(double yariCap) {
		super();
		this.yariCap = yariCap;
	}

	public double getYariCap() {
		return yariCap;
	}
	public void setYariCap(double yariCap) {
		this.yariCap = yariCap;
	}
	public double getPI() {
		return PI;
	}

	@Override
	public String toString() {
		return "Daire [yariCap=" + yariCap + ", PI=" + PI + "]";
	}
	
	
}
