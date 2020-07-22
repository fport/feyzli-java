package Throwable;

public class Hata3 {

	public static void main(String[] args) {
	//	throw new ArrayIndexOutOfBoundsException();
		try {
			islem_yap();
		} catch (Exception e) {
			System.err.println("Hata : "+ e);
		}
	
	}
	static void islem_yap() throws InterruptedException{
		System.out.println("Throw ve throws farklý kavramlardýr");
		throw new InterruptedException();
	}

}
