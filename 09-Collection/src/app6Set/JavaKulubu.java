package app6Set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JavaKulubu {

	public static void main(String[] args) {
		System.out.println("TreeSet");
		TreeSet<String> t1 = new TreeSet<String>();

		t1.add("Furkan");
		t1.add("Portakal");
		t1.add("Furki");
		t1.add("Porti");

		for (String s : t1) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		System.out.println("LinkedHashSet");
		LinkedHashSet<String> l1 = new LinkedHashSet<String>();
		
		l1.add("Furkan");
		l1.add("Portakal");
		l1.add("Furki");
		l1.add("Porti");
		l1.add("Porti");

		for (String s : l1) {
			System.out.println(s);
		}
		
	}
}
