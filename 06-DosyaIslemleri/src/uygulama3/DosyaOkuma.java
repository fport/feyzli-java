package uygulama3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {
	
	private Scanner sc;
	public void okunacakDosyalar(String dosyaAdi) {
		
		String dosyaYolu = "C:/Users/porti/Desktop/";
		
		//File file = new File(dosyaYolu + dosyaAdi + ".txt");
		
		try {
			sc = new Scanner(new File(dosyaYolu + dosyaAdi + ".txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Hata : "+ e);
		
		}
	}
	
	public void dosyaSatirOku() {
		
		while(sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());
		}
	}

	public void dosyaOkumayiKapat() {
		sc.close();
	}
	
	public void dosyaKelimeOku() {
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
	}
	
}
