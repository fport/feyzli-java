package Throwable;

public class Hata2Finally {
	public static void main(String[] args) {
        try {
            int x=12;
            int y=2;
            String a=null;
                System.out.println("String'in boyu="+a.length());
                System.out.println("x/y:"+(x/y));
        } catch (Exception e) {
            System.out.println("Bir hata oluþtu="+e);
        }
        finally {
            System.out.println("Bu kod bloðu her durumda çalýþýr.");
        }
}
}
