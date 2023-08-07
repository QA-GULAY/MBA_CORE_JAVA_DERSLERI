package Etut;

public class Employee {
    String adSoyad;
    int calisilanSaat;
    int calisilanUcret=10;

    public Employee(String adSoyad, int calisilanSaat,int calisilanUcret) {
        this.adSoyad = adSoyad;
        this.calisilanSaat = calisilanSaat;
        this.calisilanUcret=calisilanUcret;
    }
    public void maasHesapla(){

        int maas=calisilanSaat*calisilanUcret;
        System.out.println("maas:"+maas);
    }
}
