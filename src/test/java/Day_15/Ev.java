package Day_15;

public class Ev {
    public static void main(String[] args) {
        OturmaOdasi oturmaOdasi=new OturmaOdasi();
        Banyo banyo=new Banyo();
        YatakOdasi yatakOdasi=new YatakOdasi();
        int oturmaOdasiUzunluk=8;
        int oturmaOdasiGenislik=6;
        int oturmaOdasiAlan=oturmaOdasi.hesaplaDikdortgenAlan(oturmaOdasiUzunluk,oturmaOdasiGenislik);

        int banyoYuksekli=4;
        int banyoTaban=3;
        int banyoAlan=banyo.hesaplaUcgenAlan(banyoYuksekli, banyoTaban);

        int yatakOdasiKenarUznluk=5;
        int yatakOdasiAlan=yatakOdasi.hesaplaKareAlan(yatakOdasiKenarUznluk);

        int evinToplamAlani=banyoAlan+oturmaOdasiAlan+yatakOdasiAlan;
        System.out.println("evinToplamAlani:"+evinToplamAlani);
    }


}
