package uygulama3Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Uygulama3 {

	public static void main(String[] args) {
		
		/*
		 *  Set-> içinde ayni türden veri almaz 
		 *     -> içinde eklenen verileri sirali bir sekilde tutmaz
		 *     -> bu daha cok verimli deniliyor ama eklediðini birdaha ekleyemýyorsun
		 */

		Set<String> isimler = new HashSet<String>();
		
		String isim1 = "Furkan";
		String isim2 = "Porti";
		String isim3 = "Pasa";
		
		isimler.add(isim1);
		isimler.add(isim2);
		isimler.add(isim3);
		isimler.add(isim3);
		
		Iterator<String> isimIterator = isimler.iterator();
		
		while(isimIterator.hasNext()) {
			System.out.println(isimIterator.next());
		}
		
		
		System.out.println("--------------------");
		
		for(String isim : isimler) {
			System.out.println(isim);
		}
		
	}
}
