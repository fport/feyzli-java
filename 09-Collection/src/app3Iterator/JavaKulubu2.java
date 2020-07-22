package app3Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class JavaKulubu2 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Furkan");
		arrayList.add("Furki");
		arrayList.add("Porti");
		arrayList.add("Forti"); 

		Iterator<String> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			System.out.println("Üye : " + iterator.next());
		}

		System.out.println("");
		System.out.println("");

		ListIterator<String> iterator2 = arrayList.listIterator();

		while(iterator2.hasNext()) {
			Object object = iterator2.next();
			iterator2.set(object + "/");
			iterator = arrayList.listIterator();
			while(iterator.hasNext()) {
				System.out.println("Üye : "+iterator.next());
			}
		}
		
		System.out.println("");
		System.out.println("");
		//sondan geriye dogru hareket ettýk.
		while(iterator2.hasPrevious()) {
			System.out.println("Üye : "+iterator2.previous());
		}
		
		
		
	}
}
