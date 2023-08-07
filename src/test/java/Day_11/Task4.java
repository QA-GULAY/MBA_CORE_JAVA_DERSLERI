package Day_11;

public class Task4 {
    public static void main(String[] args) {
        int dogumYili=1990;
        String ilKodu="IST";
        String kutukNumarasi="1234";
        pasaportNumarasiOlustur(dogumYili,ilKodu,kutukNumarasi);


    }
    public static void pasaportNumarasiOlustur( int dogumYili,String ilKodu, String kutukNumarasi){
        String pasaportNumarasi=dogumYili+ilKodu+kutukNumarasi;
        System.out.println("pasaport numarasi ="+pasaportNumarasi);

    }

}
