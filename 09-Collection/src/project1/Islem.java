package project1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PriorityQueue<Arac> a = new PriorityQueue<Arac>();
		String s = "Sürücü adi ve araç türünü giriniz \n"
				+ "Araç türleri: Kargo, Polis, Itfaiye veya Ambulans olabilir.";
		System.out.println(s);
		
		while(a.size() < 4) {
			System.out.print("Sürücü adi :");
			String ad = scan.nextLine();
			System.out.print("Araç türü : ");
			String aracTuru = scan.nextLine();
				a.add(new Arac(ad,aracTuru));
		}
		int b =1;
		while(!a.isEmpty()) {
			System.out.println("----------");
			System.out.println("Aracin trafikteki gecis üstünlüðü siralamasi : "+b);
			System.out.println(a.poll());
			b++; 
		}
	}
}
