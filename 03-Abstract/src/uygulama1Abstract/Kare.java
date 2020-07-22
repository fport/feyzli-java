package uygulama1Abstract;

public class Kare extends Sekil{
	
	private double kenar;

	public Kare(double kenar)
	{
		this.kenar = kenar;
	}
	
	public double getKenar() {
		return kenar;
	}

	public void setKenar(double kenar) {
		this.kenar = kenar;
	}


	@Override
	public double getAlan() {
		// TODO Auto-generated method stub
		return Math.pow(kenar, 2);
	}

	@Override
	public double getCevre() {
		// TODO Auto-generated method stub
		return kenar*4;
	}
	

	
	
}
