package uygulama9;

public class Semafor {
    private int sayi;

    public Semafor(int sayi) {
        this.sayi = sayi;
    }
    public synchronized void baglanti_al(){
        while(sayi==0){
            System.out.println(Thread.currentThread().getName()+"-->bekliyor...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println(Thread.currentThread().getName()+" -->baðlantý saðlandý.");
        sayi--;
        
    }
    public synchronized void baglantiyi_birak() {
        System.out.println(Thread.currentThread().getName()+"-->baðlantýdan ayrýldý.");
                sayi++;
                notify();
    }
    
}
class Veritabani{
        public void baglantiyi_sagla() { }
        public void baglantiyi_kes(){ }
}
class Islemler extends Thread{
    Semafor s1;
    Veritabani v1;

    public Islemler(Semafor s1, Veritabani v1) {
        this.s1 = s1;
        this.v1 = v1;
    }

    @Override
    public void run() {
        super.run();
            s1.baglanti_al();
            v1.baglantiyi_sagla();
            
            v1.baglantiyi_kes();
            s1.baglantiyi_birak();
        
    }
    
}
class SemaforCalistir{
    public SemaforCalistir(int sayi){
        Veritabani v=new Veritabani();
        Semafor s=new Semafor(sayi);
            Islemler t0=new Islemler(s, v);
            Islemler t1=new Islemler(s, v);
            Islemler t2=new Islemler(s, v);
            Islemler t3=new Islemler(s, v);
                t0.start();
                t1.start();
                t2.start();
                t3.start();
            
    }
    public static void main(String[] args) {
            SemaforCalistir s=new SemaforCalistir(2);
            
    }
    
}


















