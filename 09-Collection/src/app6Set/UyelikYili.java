package app6Set;

import java.util.HashSet;

/*
 * add("...") --> Eleman eklemek için kullanýlýr
 * clear() --> Eklenmiþ olan tüm elemanlari silmek icin kullanýlýr
 * remove(int index) --> Belirtilen indexteki elemani silmek icin kullanýlýr
 * remove(Object o ) --> O olarak tanýmlanan elemani silmek icin kullanýlýr
 * size() --> Toplam eleman sayisini verir.
 */
public class UyelikYili {

	public static void main(String[] args) {
		
		HashSet<Integer> hast1 = new HashSet<Integer>();
		hast1.add(15);
		hast1.add(10);
		hast1.add(16);
		hast1.add(13);
		
		for(Integer i :hast1) {
			// ekleme sýrasýna göre sýralanmadý
			System.out.println("Üyelik yili : "+i);
		}
		hast1.remove(13);
		System.out.println();
		System.out.println();
		for(Integer i :hast1) {
			// ekleme sýrasýna göre sýralanmadý
			System.out.println("Üyelik yili : "+i);
		}
		
	}
}
