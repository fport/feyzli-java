package uygulama1;

public class Test {
	
	public static void main(String[] args) {
		
		Daire daire = new Daire(3.15);
		Kare kare   = new Kare(5);
		
		alanVeCevreYazdir(kare);
		System.out.println("**********");
		alanVeCevreYazdir(daire);
		System.out.println("**********");
		daireBilgileriYazdir(daire);
		
	}

	public static void alanVeCevreYazdir(Sekil sekil) {
		
		System.out.println("Alani : "+ sekil.alanHesapla());
		System.out.println("Cevre : "+ sekil.cevreHesapla());
	}
	
	public static void daireBilgileriYazdir(Daire daire) {
		System.out.println("Daire bilgileri : ");
		System.out.println("Yaricapi : "+ daire.getR());
		System.out.println("Cevresi : "+daire.cevreHesapla());
		System.out.println("Alani : "+daire.alanHesapla());
	}

}
