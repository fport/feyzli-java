
package uygulama13;
class SirketVeCalisanlari extends Thread {

    public SirketVeCalisanlari(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Benim adým "+getName()+","+sirket()+" adlý þirkette çalýþýyorum." );        
    }
    public String sirket(){
        return getThreadGroup().getName();
    }
    
}
public class Sirketler {
    public static void main(String[] args) {
       ThreadGroup avrupa=new ThreadGroup("Avrupa");
       ThreadGroup asya=new ThreadGroup("Asya");
       ThreadGroup afrika=new ThreadGroup("Afrika");
        SirketVeCalisanlari c1=new SirketVeCalisanlari(avrupa, "Sevda");
        SirketVeCalisanlari c2=new SirketVeCalisanlari(avrupa, "Kemal");
            avrupa.list();
        SirketVeCalisanlari c3=new SirketVeCalisanlari(asya, "Nida");
        SirketVeCalisanlari c4=new SirketVeCalisanlari(asya, "Cemal");
        SirketVeCalisanlari c5=new SirketVeCalisanlari(asya, "Dicle");
            asya.list();
        SirketVeCalisanlari c6=new SirketVeCalisanlari(afrika, "Burak");
        SirketVeCalisanlari c7=new SirketVeCalisanlari(afrika, "Beste");
            afrika.list();
            System.out.println("");
                    c1.start();
                    c2.start();
                    c3.start();
                    c4.start();
                    c5.start();
                    c6.start();
                    c7.start();
                    
 
    }
    
}

