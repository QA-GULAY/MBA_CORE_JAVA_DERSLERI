package Day_11;

public class Task5 {
    public static void main(String[] args) {
        String ad = "Ayse";
        String soyad = "Koc";
        int dogumTarihi = 1978;
        char ch = 'B';
        boolean durum = true;

        ogrenciBilgileri(ad, soyad, dogumTarihi, ch, durum);

    }

    public static void ogrenciBilgileri(String ad, String soyad, int dogumTarihi, char ch, boolean durum){
        String ogrenciBilgileri = ad + soyad + dogumTarihi + ch + durum;
        System.out.println("OGRENCI  BILGILERi\n " +"Ad= " + ad+"\nSoyad = " + soyad+"\nDogum Tarihi=  " + dogumTarihi+"\nEhliyet sinifi = "+ch+"\nDevam Durumu = "+durum);

    }


}

