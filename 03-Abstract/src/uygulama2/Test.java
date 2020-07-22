package uygulama2;

public class Test {
	
	public static void main(String[] args) {
		Bmw bmw = new Bmw("520d", "Kirmizi", 2500, 500);
		
		Mercedes mercedes = new Mercedes("CLA180", "Siyah", 3500, "25");
		
		//bilgileriGoruntule(mercedes);
		bmwBilgi bilgi = new bmwBilgi();
		
		//bilgi.bmwBilgi(bmw);
		//mercedesBilgi(mercedes);
		MercedesBilgi.MercedesBilgi(mercedes);
	}
	
	
	public static void bilgileriGoruntule(Araba araba) {
		
		System.out.println("Markasi : "+araba.getModel());
		System.out.println("Renk : "+araba.getRenk());
		System.out.println("Agirlik : "+araba.getAgirlik());
		System.out.println("Kac de ml benzin : "+araba.kmBasiKacLtBenzi());
	}
	
	
	
}
