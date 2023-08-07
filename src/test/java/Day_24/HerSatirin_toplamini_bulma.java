package Day_24;

public class HerSatirin_toplamini_bulma {
    public static void main(String[] args) {
        int[][] sayilar = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        int satirUzunlugu=sayilar[0].length;

        for (int i = 0; i <satirUzunlugu; i++) {

            int toplamSatir=0;

            for (int j = 0; j <sayilar.length ; j++) {

                toplamSatir+=sayilar[i][j];
            }
            System.out.println("toplamSutun:"+toplamSatir);
        }
    }
}
