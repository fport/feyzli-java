package app9Map;
/*
 * put() : Anahtar/Key ve Deger/Value ekleme iþlevi yerine getirir.
 * get(key) : Anahtara karþýlýk gelen degeri döndürür.
 * remove() : Anahtara veya degere karþýlýk gelen veriyi siler.
 * size() : Map içerisinde depolanan anahtar ve degerlerin sayisini döner
 * clear() : Map içerisinde depolanan tüm verileri siler.
 * containsKey(key) : Depolanan veri içerisinde anahtar aramayý saglar.
 * Eger anahtar varsa 'true' yoksa 'false' döner.
 * 
 * HashMap<K,V> 
 * - Map sýnýfýnýn bir temel ozelliði olarak generic olarak tanýmlanmýstýr.
 * Bu sayede farklý veri tiplerinde farklý islemler yapýlabilir.
 * Ayrica veriler anahtar deger iliþkisine göre depolanýr
 * 
 *-	Ayni anahtar tanýmý sadece bir kez yapabilmesine karsýn ayný deger birden 
 *	fazla kez depolanabilir.
 *
 *- Elemanlar bellekte rastgele depolanýr.
 * */

import java.util.HashMap;
import java.util.Map;

public class Kent {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(34, "Ýstanbul");
		hashMap.put(01, "Adana");
		hashMap.put(78, "Karabük");
		hashMap.put(16, "Bursa");
		hashMap.put(15, "Burdur");
		hashMap.put(06, "Ankara");
		hashMap.put(36, "Kars");

		for (Integer i : hashMap.keySet()) {
			System.out.println("Plaka(K) : " + i + "->" + " Kent(V) " + hashMap.get(i));
		}

		hashMap.remove(36);
		System.out.println(" ");
		System.out.println("Kentler : " + hashMap);
		System.out.println(" ");
		hashMap.put(34, "Edirne");
		System.out.println("Kentler : " + hashMap);
		System.out.println(" ");
		System.out.println("Kars depolandý mi ? " + hashMap.containsKey(36));

		System.out.println();
		for (Map.Entry<Integer, String> m2 : hashMap.entrySet()) {
			System.out.println("Plaka(K) : "+ m2.getKey()+"  -> "+"Kent(V) : "+m2.getValue());
		}

	}
}
