package Day_24;

public class Not_Ortalamasi {
    public static void main(String[] args) {
        int [][] notOrtalamsi = {
                {99,42,74,83,100},
                {90,91,72,88,95},
                {88,61,74,89,96},
                {61,89,82,98,93}, //row 3
                {93,73,75,78,99},
                {50,65,92,87,94}
        };
        int toplam =0;
        for (int i = 0; i < notOrtalamsi.length; i++) {
            toplam += notOrtalamsi[i][0];
        }
        int notOrtalamasi = toplam/notOrtalamsi.length;
        System.out.println("notOrtalamsi = " + notOrtalamasi);

    }
}
