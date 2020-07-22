package uygulama8;

public class SosyetePazari {
	public static void main(String[] args) {
		AcikBolge bolge = new AcikBolge();
		Uretici u = new Uretici(bolge);
		Tuketici t = new Tuketici(bolge);
		u.start();
		t.start();

	}
}
