package Day_24;

public class HerSutununToplaminiYazdirma {
    public static void main(String[] args) {
        int[][] sayilar = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        int sutunUzunlugu=sayilar[0].length;

        for (int i = 0; i <sutunUzunlugu; i++) {

            int toplamSutun=0;

            for (int j = 0; j <sayilar.length ; j++) {

                toplamSutun+=sayilar[j][i];
            }
            System.out.println("toplamSutun:"+toplamSutun);
        }


    }
}
