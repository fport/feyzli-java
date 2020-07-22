package app3Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * next() --> bir sonraki elemaný dondürür.
 * prevous() --> bir önceki elemani dondürür
 * hasNext() --> bir sonraki indexte eleman varsa true yoksa false dondurur
 * hasPrevious --> önceki indexte eleman varsa true yoksa false degeri dondurur
 * */
public class JavaKulubu {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Furkan");
		linkedList.add("Porti");
		linkedList.add("Furki");
		linkedList.add("Forti");
		
	}

	public static void uyeleriYazdir(LinkedList<String> linkedList) {
		
		ListIterator<String> iterator = linkedList.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println("Üye : " + iterator.next()  );
		}
		
	}
}
