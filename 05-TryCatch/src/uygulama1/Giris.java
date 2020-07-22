package uygulama1;

public class Giris {
	
	public static void main(String[] args) {
		
		int [] sayilar = new int[5];
		
		System.out.println("Selamun");
		try {
			System.out.println(sayilar[6]);
		}catch (Exception e) {
			System.err.println("Hata : "+e);
		}
		System.out.println("Aleykum");
	}
}
