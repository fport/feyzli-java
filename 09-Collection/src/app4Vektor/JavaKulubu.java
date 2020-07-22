package app4Vektor;

import java.util.Iterator;
import java.util.Vector;

public class JavaKulubu {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		
		v1.add("Furkan");
		v1.add("Furki");
		v1.add("Porti");
		v1.add("Forti"); 
		
		Iterator<String> i1 = v1.iterator();
		
		while(i1.hasNext()) {
			System.out.println("Üye : "+ i1.next());
		}
		
		System.out.println("");
		System.out.println("");

		String [] array = new String [4];
			v1.toArray(array);
			for(int i=0 ; i<array.length ; i++) {
				System.out.println("Üye : "+array[i]);
			}
		
	}
}
 