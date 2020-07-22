package uygulama7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import uygulama5.Denetim;

public class Engel {
	public static void main(String[] args) {
		AUyeleri a1 = new AUyeleri();
		BUyeleri b1 = new BUyeleri();
		Thread t = new Thread(a1);
		
		a1.setPriority(9);
		b1.setPriority(2);
		
		a1.start();
		b1.start();
		
	}
}

class AUyeleri extends BUyeleri implements Runnable {

	public String ad = "uye-A";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			int uyeSayisi = 0;
			while (true) {
				if ((uyeSayisi % 100000) == 0) {
					System.out.println(ad + " Uye sayisi =" + uyeSayisi);
				}
				uyeSayisi++;
			}

		} catch (Exception e) {
			System.out.println("Hata : " + e);
		}
	}
}

class BUyeleri extends Thread {

	public String ad = "uye-B";

	@Override
	public void run() {
		super.run();
		try {
			int uyeSayisi = 0;
			while (true) {
				if ((uyeSayisi % 100000) == 0) {
					System.out.println(ad + " Uye sayisi =" + uyeSayisi);
				}
				if ((uyeSayisi == 50000)) {
					System.out.println("Lutfen yasinizi giriniz : ");
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("-->" + bufferedReader.readLine());
				}
				uyeSayisi++;
			}

		} catch (Exception e) {
			System.out.println("Hata : " + e);
		}
	}
}