package uygulama4InstanceOf;

public class Kare extends Sekil{
	
	private int kenar;
	
	public Kare() {
		// TODO Auto-generated constructor stub
	}
	public Kare(int kenar) {
		this.kenar = kenar;
	}

	public void setKenar(int kenar) {
		this.kenar = kenar;
	}
	

	@Override
	public double getAlan() {
		// TODO Auto-generated method stub
		return kenar*kenar ;
	}
	
	@Override
	public double getCevre() {
		// TODO Auto-generated method stub
		return kenar*4;
	}
	
	
}
