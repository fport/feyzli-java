package uygulama2Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {

	public static void main(String[] args) {
		
		File dosya = new File("C:/Users/porrt/Desktop/Metin.txt");
		
		try {
			Scanner scan = new Scanner(dosya);
			/*
			String line1 = scan.nextLine();
			String line2 = scan.nextLine();
			//String word1 = scan.next();
			System.out.println(line1);
			System.out.println(line2);*/
			
			
			/*	String metinBelgesi ;
			    while(scan.hasNext()){
				 
				metinBelgesi = scan.next();
				System.out.println(metinBelgesi);
		}*/
			/*String metinBelgesi ;
			while(scan.hasNextLine()) {
				metinBelgesi = scan.nextLine();
				System.out.println(metinBelgesi);
						
			}*/
			String metinBelgesi = "" ;
			while(scan.hasNextLine()) {
				metinBelgesi =  metinBelgesi  + scan.nextLine();
				metinBelgesi = metinBelgesi + " ";
			}
			System.out.println(metinBelgesi);
			 
		} catch (FileNotFoundException e) {
			
			System.err.println("Hata : "+e);
		}
	}
}
