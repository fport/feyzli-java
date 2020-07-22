package uygulama4;
//birisi uyurken digeri calýsýyor.
public class Denetim2 {

	public static void main(String[] args) {
		Gorevli1 gorevli1 = new Gorevli1();
		Gorevli2 gorevli2 = new Gorevli2();
		gorevli1.start();
		gorevli2.start();

		gorevli1.interrupt();
		gorevli2.interrupt();

	}
}

class Gorevli1 extends Thread {

	@Override
	public void run() {
		super.run();
		for (int i = 0; i <= 5; i++) {
			try {
				if(Thread.interrupted()) {
					System.out.println("Gorevli-1 uyandi"+Thread.interrupted());
				}
				System.out.println("Gorevli-1 uyuyor.");
				Thread.sleep(3000);
				
			} catch (Exception e) {
				System.out.println("Bir hata olustu :" + e);
			}
		}
	}

}

class Gorevli2 extends Thread {

	@Override
	public void run() {
		super.run();
		
		for(int i=0;i<=5;i++) {
			try {
				if(this.interrupted()) {
					System.out.println("Gorevli-2 uyandi."+this.isInterrupted());
					System.out.println("Gorevli-2 uyuyor...");
					Thread.sleep(2000);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}