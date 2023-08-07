package Day_29;

import java.util.ArrayList;

public class Listedeki_sayilari_silme {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(12);
        sayilar.add(32);
        sayilar.add(22);
        sayilar.add(51);

        System.out.println("orjinal liste:"+sayilar);

        for (int i = sayilar.size()-1; i >=0 ; i--) {
            int sayi=sayilar.get(i);
            if (sayi%2==0){
                System.out.println(sayilar.get(i));
                sayilar.remove(i);

            }

        }
        System.out.println("silinmis liste:"+sayilar);
    }
}
