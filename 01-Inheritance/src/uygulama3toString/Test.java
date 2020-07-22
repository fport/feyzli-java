package uygulama3toString;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci("Furkan", "Portakal", 1999, "123123", null);
		
		ArrayList<String> ders = new ArrayList<String>();
		ders.add("Fizik");
		ders.add("Kimya");
		ders.add("Mat");
		
		ogrenci1.setDersler(ders);
		
		System.out.println(ogrenci1);
		
	}
}
