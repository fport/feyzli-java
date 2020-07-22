package uygulama1Abstract;

public class Daire extends Sekil{

	private  double yaricap;
	
	public Daire() {
		// TODO Auto-generated constructor stub
	}
	public Daire(double yaricap) {
		super();
		this.yaricap = yaricap;
	}
	
	public double getYaricap() {
		return yaricap;
	}
	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}
	@Override
	public double getAlan() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(yaricap, 2);
	}
	@Override
	public double getCevre() {
		// TODO Auto-generated method stub
		return 2*Math.PI * yaricap;
	}
}
