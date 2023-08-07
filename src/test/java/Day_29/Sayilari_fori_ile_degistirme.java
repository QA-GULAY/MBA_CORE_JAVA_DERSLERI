package Day_29;

import java.util.ArrayList;

public class Sayilari_fori_ile_degistirme {
    public static void main(String[] args) {

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(12);
        sayilar.add(32);
        sayilar.add(22);
        sayilar.add(51);

        System.out.println(sayilar);

        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.set(i,5);

        }
        System.out.println(sayilar);
    }
}
