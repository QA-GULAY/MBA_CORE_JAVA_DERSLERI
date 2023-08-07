package Day_29;

import java.util.ArrayList;

public class Derecelendirme_ortalama {
    public static void main(String[] args) {

        ArrayList<Double>derecelendirme=new ArrayList<>();
        derecelendirme.add(6.5);
        derecelendirme.add(6.3);
        derecelendirme.add(9.3);
        derecelendirme.add(7.3);
        derecelendirme.add(8.5);

        int toplam=0;
        for (Double derece:derecelendirme) {
            toplam +=derece;
        }
        System.out.println("toplam:"+toplam);
        double ortalama=toplam/derecelendirme.size();
        System.out.println("ortalama:"+ortalama);

        if (ortalama>=8){
            System.out.println("Bu filmler mukemmel!!!");

        } else if (ortalama<=8 && ortalama>=6) {
            System.out.println("Bu filmler cik iyi");

        } else if (ortalama<6) {
            System.out.println("BU FILMLER PEK IYI DEGIL");

        }else {
            System.out.println("Gecersiz ortalama");
        }


    }
}
