package uygulama1extends;

public class Test {
	public static void main(String[] args) {

		Ogretmen ogretmen1 = new Ogretmen();

		ogretmen1.setAdi("Ferhat");
		ogretmen1.setSoyadi("Aykan");
		ogretmen1.setDogumYili(1999);
		ogretmen1.setBrans("Java");

		System.out.println("Adi : " + ogretmen1.getAdi());
		System.out.println("Soyadi : " + ogretmen1.getSoyadi());

	}
}
