package Day_24;

public class Ogrenci_Bilgileri {
    public static void main(String[] args) {
        String [][] ogrenciBilgileri = {
                {"Ogrenci No","Isim","Soy isim","Dogum yeri"},//row 0
                {"925","Elif","Yildiz","Antalya"},      //row 1
                {"369", "Murat","Kara","Izmir"},       //row 2
                {"988","Hande","Akdeniz","Istanbul"},  //row 3
                {"256","Hasan","Akdeniz","Istanbul"},  //row 4
                {"125","Ferit","Demir","Aydin"},      //row 5
                {"341","Cemile","Gok","Aydin"}        //row 6
        };
        System.out.println("ogrenciBilgileri.length : " + ogrenciBilgileri.length);
        System.out.println("ogrenciBilgileri[3].length : " + ogrenciBilgileri[3].length);
        for (int i = 0; i < ogrenciBilgileri[3].length; i++) {
            System.out.println("Handenin "+ogrenciBilgileri[0][i]+" : " + ogrenciBilgileri[3][i]);
        }
    }
}
