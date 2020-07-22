package app5Stack;

import java.util.Stack;

/*
 * push   -- > Eleman eklemek icin kullanýlýr
 * peek   -- > Son eklenen elemaný döndürür.
 * pop 	  -- > Son eklenen elemaný döndürür ve siler
 * remove -- > Stack içinde elemani siler
 * empty  -- > Stack içinde eleman olup olmadýgýný kontrol eder.
 * 			   Eger eleman varsa true; yoksa false dondürür.
*/
public class Ýslem {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		 s1.push("a");
		 s1.push("b");
		 s1.push("c");
		 s1.push("d");
		 
		 for(String x : s1) {
			 System.out.println("Deger :"+ x); 
		 }
		 System.out.println();
		 System.out.println();
		 System.out.println("Son depolanan eleman : "+s1.peek());

		 System.out.println();
		 System.out.println();
		 System.out.println("Eleman cikarildi : "+s1.pop());
		 for(String x : s1) {
			 System.out.println("Deger :"+ x);
		 }
		 
	}

}