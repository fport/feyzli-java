package uygulama2;

public class MercedesBilgi {
	public static void MercedesBilgi(Mercedes mercedes) {
		System.out.println("Markasi : "+mercedes.getModel());
		System.out.println("Renk : "+mercedes.getRenk());
		System.out.println("Agirlik : "+mercedes.getAgirlik());
		System.out.println("Kac de ml benzin : "+mercedes.kmBasiKacLtBenzi());
		System.out.println("Cant Kalinligi: "+mercedes.getCantKalinligi());
	}

	@Override
	public String toString() {
		return "MercedesBilgi [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
