package uygulama1Abstract;

public class Test {
	
	public static void main(String[] args) {
		
		Kare kare1 = new Kare(4);
		Daire daire1 = new Daire(3.2);
		
		Sekil sekil = kare1;
		
		hesapla(sekil);
	}
	
	public static void hesapla ( Sekil sekil) {
		System.out.println("Alan : "+ sekil.getAlan());
	}
}
