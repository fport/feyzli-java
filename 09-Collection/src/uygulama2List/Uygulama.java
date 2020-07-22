package uygulama2List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Uygulama {

	public static void main(String[] args) {
		/*
		 * Collection en baba interface
		 * List -> içine eklenen verileri siralý bir sekilde tutar
		 * 		-> eklenmiþ veri bir daha eklenebilir.
		 */

		String isim1 = "Ferhat";
		String isim2 = "Furkan";
		String isim3 = "Burak";
		List<String> isimler = new ArrayList<String>();
		
		isimler.add(isim1);
		isimler.add(isim2);
		isimler.add(isim3);
		isimler.add(isim1);
		isimler.add(isim2);
		
		for(String isim : isimler) {
			System.out.println(isim);
		}
		System.out.println("----------");
		
		
		
		Iterator<String> iterator = isimler.iterator();
		
		while(iterator.hasNext()) {
			String isim = iterator.next();
			System.out.println(isim);
		}
		System.out.println("----------");
		boolean durum = isimler.contains(isim3);
		System.out.println("isim 3 var mý ?"+durum);

		int boyut = isimler.size();
		System.out.println("Boyut : "+boyut);
		
	}
}
