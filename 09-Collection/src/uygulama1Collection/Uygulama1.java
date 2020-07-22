package uygulama1Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList<String>();
		
		collection.add("Furkan");
		collection.add("Furki");
		collection.add("Porti");
		
		for (String isim : collection) {
			
			System.out.println(isim);
		}
		
	}
}
