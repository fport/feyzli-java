package Throwable;

public class SayilarVeUlkeler <T>{
/*
ilkel Veri Tipleri-> Referans Tipler
int->Integer
boolean->Boolean
char->Character
byte->Byte
short->Shot
long->Long
float->Float
double->Double
    */    
    public static <T2> void ekrana_bastir(T2[] c1){
        for(T2 k:c1){
            System.out.println(k);
        }
    }
    public static void main(String[] args) {
        String [] ulkeler={"Almanya","Turkiye","Ingiltere","Azerbaycan"};
        Integer [] sayilar={6,34,16,15};
            ekrana_bastir(ulkeler);
            ekrana_bastir(sayilar);
        
}
    
}
