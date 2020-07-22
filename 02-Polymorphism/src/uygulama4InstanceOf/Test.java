package uygulama4InstanceOf;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		Daire daire1 = new Daire(4.15);
		Daire daire2 = new Daire(5.12);
		
		Kare kare1 = new Kare(5);
		Kare kare2 = new Kare(5);
		
		hesapla(kare1);
		
	}
	
	public static void hesapla(Sekil sekil) {
		
		if(sekil instanceof Kare) {
			System.out.println("Kare ");
			System.out.println("-----------");
			System.out.println("Alan : "+ sekil.getAlan());
		}
		else if (sekil instanceof Daire) {
			System.out.println("Daire :  ");
			System.out.println("-----------");
			System.out.println("Alan : "+ sekil.getAlan());
			System.out.println("Cevre : "+ sekil.getCevre());
		}
	}
}
