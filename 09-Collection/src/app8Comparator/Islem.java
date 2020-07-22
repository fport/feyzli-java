package app8Comparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Islem {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Zafer");
		l1.add("Miray");
		l1.add("Gül");
		l1.add("Ahmet");
		
		Collections.sort(l1);
		for(String s: l1) {
			System.out.println("Deger :"+s);
		}
	
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(7);
		l2.add(3);
		l2.add(4);
		l2.add(8);
		
		//Collections.sort(l2);
		Collections.sort(l2, new Siralama());
		for (Integer integer : l2) {
			System.out.println("Deger "+integer);
		}
		
		
	}
}

class Siralama implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		//return o1.compareTo(o2); kucukten buyuge sýralama
		return -o1.compareTo(o2); //büyükten kucuge sýralama
	}
	
}