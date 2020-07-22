package uygulama2;

public class bmwBilgi {
	public static void bmwBilgi(Bmw bmw) {
		System.out.println("Markasi : "+bmw.getModel());
		System.out.println("Renk : "+bmw.getRenk());
		System.out.println("Agirlik : "+bmw.getAgirlik());
		System.out.println("Kac de ml benzin : "+bmw.kmBasiKacLtBenzi());
		System.out.println("Devir Sayisi: "+bmw.getDevirSayisi());
	}
}
