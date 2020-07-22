package app2LinkedList;

import java.util.LinkedList;

public class JavaKulubu {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Furkan");
		linkedList.add("Furki");
		linkedList.add("Porti");
		linkedList.add("Burak");
		
		for (String string : linkedList) {
			System.out.println("Üye : "+string);
		}
		
		System.out.println();
		System.out.println("3.Index Uye : " + linkedList.get(3));
		System.out.println();
		linkedList.add(0, "Mehmet");
		for(int i=0 ; i<linkedList.size() ; i++) {
			System.out.println(linkedList.get(i));
		}
		
		linkedList.clear();
		linkedList.add("PortiX");
		System.out.println();
		for (String string : linkedList) {
			System.out.println("Üye : "+string);
		}
		
	}
}
