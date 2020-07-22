package uygulama4InstanceOf;


public class Daire extends Sekil {

	private double yaricap;
	
	public Daire() {
		// TODO Auto-generated constructor stub
	}

	public Daire(double yaricap) {
		this.yaricap = yaricap;
	}

	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}
	
	@Override
	public double getAlan() {
		// TODO Auto-generated method stub
		return Math.PI*yaricap*yaricap;
	}
	@Override
	public double getCevre() {
		// TODO Auto-generated method stub
		return 2*Math.PI*yaricap;
	}
	
}
