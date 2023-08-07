package Day_24;

public class Min_max_degerleri_bulma {
    public static void main(String[] args) {
        int[][] sayilar = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        int min = sayilar[0][0];
        int max = sayilar[0][0];

        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[0].length ; j++) {
                if (sayilar[i][j]<min){
                    min=sayilar[i][j];
                }if (sayilar[i][j]>max){
                    max=sayilar[i][j];
                }
            }

        }
        System.out.println("min:"+min);
        System.out.println("max:"+max);

    }
}
