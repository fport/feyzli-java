package uygulama4GenericMetot;

public class Kare {

	private double kenar;

	public Kare() {
		// TODO Auto-generated constructor stub
	}

	public Kare(double kenar) {
		super();
		this.kenar = kenar;
	}

	public double getKenar() {
		return kenar;
	}

	public void setKenar(double kenar) {
		this.kenar = kenar;
	}

	@Override
	public String toString() {
		return "Kare [kenar=" + kenar + "]";
	}

}
