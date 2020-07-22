package uygulama1;

public class ArabaIslemleriImpl2 implements ArabaIslemleri{

	@Override
	public void arabaBilgiYazdir(Araba araba) {

		System.out.println("Marka : "+araba.getMarka());
		System.out.println("Model : "+araba.getModel());
		System.out.println("Uretim YÝli:"+araba.getUretimYili());
		System.out.println("Renk : "+araba.getRenk());
	}

	@Override
	public boolean arabaKaydet(Araba araba) {

		System.out.println("Kaydedilen Araba ;");
		arabaBilgiYazdir(araba);
		System.out.println("------------");
		return arabalar.add(araba);
	}

	@Override
	public boolean arabaSil(Araba araba) {
		
		System.out.println("Silinen Araba ;");
		arabaBilgiYazdir(araba);
		
		return arabalar.remove(araba);
	}

	@Override
	public void arabaListele() {

	for (Araba araba : arabalar) {
		System.out.println("------------------");
		arabaBilgiYazdir(araba);
		System.out.println("------------------");
	}
  }

}
