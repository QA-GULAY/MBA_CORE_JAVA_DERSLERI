package Day_15.Exercise4;

public class Main {
    public static void main(String[] args) {
        UcgenAlan ucgenAlan = new UcgenAlan();
        double ucgenTabanUzunlugu = 25.5;
        double yukseklik = 18;
         double alan= ucgenAlan.alanHesapla(ucgenTabanUzunlugu, yukseklik);
        System.out.println(alan);
    }
}
