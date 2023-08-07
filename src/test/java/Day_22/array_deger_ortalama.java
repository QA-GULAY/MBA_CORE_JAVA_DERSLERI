package Day_22;

public class array_deger_ortalama {
    public static void main(String[] args) {
        int sayilar[]={2,4,6,8,10};

        int toplam=0;
        for (int i = 0; i <sayilar.length ; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("toplam:"+toplam);
        System.out.println("ortalama:"+toplam/sayilar.length);
    }
}
