package uygulama1;

public class Araba {
	
	private String marka;
	private String model ;
	private int uretimYili;
	private String renk;
	
	public Araba() {
		// TODO Auto-generated constructor stub
	}

	public Araba(String marka, String model, int uretimYili, String renk) {
		this.marka = marka;
		this.model = model;
		this.uretimYili = uretimYili;
		this.renk = renk;
	}	
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getUretimYili() {
		return uretimYili;
	}

	public void setUretimYili(int uretimYili) {
		this.uretimYili = uretimYili;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	@Override
	public String toString() {
		return "Araaba [marka=" + marka + ", model=" + model + ", uretimYili=" + uretimYili + ", renk=" + renk + "]";
	}

	
	
}
