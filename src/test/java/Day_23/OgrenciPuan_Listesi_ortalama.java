package Day_23;

public class OgrenciPuan_Listesi_ortalama {
    public static void main(String[] args) {
        double []notlar={55.60,65.08,70.0};
        double notOrtalamasi=ogrenciPuanOrtalamasi(notlar);
        System.out.println("notOrtalamasi:"+notOrtalamasi);


    }
    public static double ogrenciPuanOrtalamasi(double[]notlar) {
        double toplam = 0;
        for (double not : notlar) {
            toplam = toplam + not;



        }
        double ortalama = toplam / notlar.length;
        return ortalama;
    }
    }
