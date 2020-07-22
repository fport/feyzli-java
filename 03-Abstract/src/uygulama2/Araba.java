package uygulama2;

public abstract class Araba {
	
	private String model;
	
	private String renk;
	
	private double agirlik;
	
	public Araba() {
		// TODO Auto-generated constructor stub
	}

	public Araba(String model, String renk, double agirlik) {
		super();
		this.model = model;
		this.renk = renk;
		this.agirlik = agirlik;
	}
	
	public abstract double kmBasiKacLtBenzi();
	
	
 	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public double getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(double agirlik) {
		this.agirlik = agirlik;
	}

	@Override
	public String toString() {
		return "Araba [model=" + model + ", renk=" + renk + ", agirlik=" + agirlik + "]";
	}
	 
	
	
}
