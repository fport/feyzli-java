package app1Liste;

import java.util.ArrayList;
import java.util.List;

public class JavaKulubu {

	/*
	 *  a bir degisken adi
	 *  a.add(".."); 
	 *  a.clear("..");
	 *  a.remove("object o");
	 *  a.size(); // listede depolanan eleman sayisi verir.
	 *  a.get(int index);
	 * */

	public static void main(String[] args) {
		
		List<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		
		a1.add("Furkan Portakal");
		a1.add("Kazým Tan");
		a1.add("Merve Kara");
		a1.add("Burak Sar");
		
		System.out.println(a1);
		System.out.println(" ");
		
		//eklenme sýrasýna gore yazdýrýyor.
		for (String string : a1) {
			System.out.println(string);
		}
		
		a1.remove(3);
		System.out.println(" ");

		for(int i=0 ; i<a1.size() ; i++) {
			System.out.println("uye : "+ a1.get(i));
		}
		
	} 
	
}
