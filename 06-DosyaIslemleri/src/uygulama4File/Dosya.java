package uygulama4File;

import java.io.File;
import java.sql.Date;

public class Dosya {

	public static void main(String[] args) {
		File file = new File("C:/Users/porrt/Desktop/Deneme");
		boolean calismaDurumu = file.canExecute();
		System.out.println("Calisma Durumu : "+ calismaDurumu);;
		boolean okumaDurumu = file.canRead();
		System.out.println("Okuma Durumu : "+ okumaDurumu);;
		boolean yazmaDurumu = file.canWrite();
		System.out.println("Yazma Durumu : "+ yazmaDurumu);;
	
		boolean durum = file.exists();
		System.out.println("Is it File ? : "+ durum);
		
		// kýsayolu olan bir uygulamanýn path bulmak icin
		String path = file.getAbsolutePath();
		System.out.println("Path : "+ path);
		
		String name = file.getName();
		System.out.println("Name : "+name);
		
		String parent = file.getParent();
		System.out.println("Parent : "+parent);
		
		
		long last = file.lastModified();
		Date date  = new Date(last);
		System.out.println("Data : "+date);
	}
	
}
