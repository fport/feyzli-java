package app9Map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

/*
TreeMap
•Map interfacesinin yanýnda ayrýca NavigableMap Araüyüzünü impelement 
eder yani 
kurgular bundan dolayý Map ve Navigable Map interfacesinin metodlarýný,
özelliklerini vb. içerir."descendingKeySet" ve "descendingMap" NavigableMap
sýnýfýnda tanýmlý önemli metodlardýr.

•Anahtar-deðer mantýðýna göre çalýþýr ve bir anahtar sadece bir deðere 
karþýlýk kullanýlabilir.

•Anahtar ile deðerleri aðaç yapýsýna uygun olarak depolanýr.Çalýþma ise
 anahtara göre doðal sýraya veya comparator tarafýndan belirlenen 
 sýraya göredir.

LinkedHashMap
•Map interfacesini impelement eder yani kurgular bundan dolayý Map 
interfacesinin metodlarýný,özelliklerini vb. içerir.

•Anahtar-deðer mantýðýna göre çalýþýr ve bir anahtar sadece bir deðere 
karþýlýk kullanýlabilir.

•LinkedHashMap sýnýfý,HashMap sýnýfýnýn dezavantajlý olduðu verilerin
rastgele sýralama özelliðine bir alternatif saðlar.Dolayýsýyla
 veriler rastgele deðil ekleme sýrasýna göre sýralanýr

*/
public class Firma {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(3, "Hakan");
		tMap.put(9, "Sude");
		tMap.put(1, "Furkan");
		tMap.put(12, "Porti");
		
		for(Integer i : tMap.keySet()) {
			System.out.println("Numara (K) : "+i+" --> Calýþan(V) : "+tMap.get(i));
		}
		
		LinkedHashMap<Integer, String> kMap = new LinkedHashMap<Integer, String>();
		kMap.put(1, "Ocak");
		kMap.put(4, "Nisan");
		kMap.put(3, "Mart");
		kMap.put(2, "Þubat");

		for(Map.Entry<Integer,String> m2 : kMap.entrySet()) {
			System.out.println(m2.getKey()+".ay ->"+m2.getValue()+" ayina karþýlýk gelir");
		}
		
		Map<Integer, String> t2Map = new TreeMap<Integer, String>();
		
		t2Map.put(2, "a");
		t2Map.put(4, "s");
		t2Map.put(3, "c");
		System.out.println("Anahtar -->"+t2Map.keySet());
		
		
		
		
	}
}
