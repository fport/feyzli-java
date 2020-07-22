package app7Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * offer() --> Eleman ekleme iþlevi yerine getirir. Bu iþlev basarýlý olursa 
 *   	 	  'true' basarýsýz olursa 'false' degeri dondurur.
 * add() --> Eleman ekleme iþlevi yerine getirir. Eleman eklememesi durumunda
 * 			Java tarafýndan hata firlatýr ve program durur
 * clear() --> Kuyruga eklenen tüm verileri temizler.
 * size() --> Kuyruktaki depolanan eleman sayisini verir.
 * remove() --> Depolanan elemaný 'first in first out' yapýsýna uygun olarak
 * 			kuyruktan siler.Ancak kuyrukta eleman yoksa Java tarafýndan hata fýrlatýlýr
 * poll() -->Depolanan elemani 'first in first out' yapisina uygun olarak kuyruktan
 * 			siler. Kuyrukta herahngi bir eleman yoksa 'null' degeri döner.
 * element()--> Dopalanan ilk elemani dondurur. Herhangi bir eleman olmamasý durumunda 
 * 			java hata fýrlatýr.
 * peek()--> Dopalanan ilk elemani dondurur Herhangi bir eleman olmamasý durumunda 'null' degeri doner
 * isEmpty() --> Kuyrukta eleman olup olmadýgýný kontrol eder. 
 * Eger eleman bulursa 'false' eleman bulunmuyorsa 'true' döndürür.
 */

public class Islem {

	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList();
		q1.offer("a");
		q1.offer("b");
		q1.offer("c");
		q1.offer("d");
		System.out.println("q1 kuyrugunun boyu : " + q1.size());
		System.out.println("q1 kuyrugunun depýlanan ilk eleman : " + q1.element());

		while(!q1.isEmpty()) {
			System.out.println("q1 kuyrugundaki eleman siliniyor : "+q1.poll());
		}
		
		
		System.out.println("");
		//cunku butun elemanlarý sýldýk kral
		System.out.println("Depolanan ilk veri : "+q1.peek());
		// element kullanmýyoruz  cunku hata fýrlatýyor null dondurdugu ýcýn peek tercih edilir.
		System.out.println("Depolanan ilk veri : "+q1.element());
		
	}

}
