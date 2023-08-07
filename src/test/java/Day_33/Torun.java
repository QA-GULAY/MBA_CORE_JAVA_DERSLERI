package Day_33;

public class Torun extends Dede {
    String name = "Master";
    int id = 23456;
    boolean statu = true;

    public void ogrenciBilgisi() {
        System.out.println(name + "hala ogrenci");
    }

    // METOD OVERRIDING (AYNI ISIM AYNI SIGNITURE ICEREN METODLAR INHERIT EDILEN CLASS YAPABILIR)
    public void haberlesme() {
        System.out.println("facebook ile haberlesiyoruz!");

    }
}