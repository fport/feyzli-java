package uygulama4GenericMetot;

public class Test {

	public static void main(String[] args) {
		
		/*Daire daire = new Daire(5.7);
		DaireIslemleri daireIslemleri = new DaireIslemleri();
		double alan = daireIslemleri.alanHesapla(daire);
		double cevre = daireIslemleri.cevreHesapla(daire);
		
		System.out.println("Daire ;");
		System.out.println("Alan : " + alan);
		System.out.println("Cevre : " + cevre);
		
		System.out.println("-------------");
		Kare kare = new Kare(7);
		KareIslemleri kareIslemleri = new KareIslemleri();
		
		double alan1 = kareIslemleri.alanHesapla(kare);
		double cevre1 = kareIslemleri.cevreHesapla(kare);
		
		System.out.println("Kare ;");
		System.out.println("Alan : " + alan1);
		System.out.println("Cevre : " + cevre1);*/
		
		/*Daire daire = new Daire(5.7);
		Kare kare = new Kare(7);
		
		DaireIslemleri daireIslemleri = new DaireIslemleri(daire);
		System.out.println("Daire cevre : "+daireIslemleri.cevreHesapla());
		System.out.println("Daire alan : "+daireIslemleri.alanHesapla());
		*/
		Kare kare = new Kare(7);
		KareIslemleri islemleri = new KareIslemleri(kare) ;
		System.out.println("Alan : "+islemleri.alanHesapla());
		
		
				
	}
	
}
