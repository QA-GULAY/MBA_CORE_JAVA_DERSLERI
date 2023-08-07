package Day_24;

public class Satir_toplamlari {
    public static void main(String[] args) {
        int[][] multiDim = {
                {36,9,87},
                {2,4,5,6,9},
                {3,11,62}
        };
        for (int i = 0; i < multiDim.length; i++) {
            int toplam =0;
            int sutun = multiDim[i].length;
            for (int j = 0; j < sutun; j++) {
                toplam += multiDim[i][j];
            }
            System.out.println("satir toplamlari : "+ toplam);
        }
    }
}
