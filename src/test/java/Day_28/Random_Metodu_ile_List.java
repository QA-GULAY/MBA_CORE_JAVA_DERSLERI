package Day_28;

import java.util.ArrayList;
import java.util.Random;

public class Random_Metodu_ile_List {
    public static void main(String[] args) {
        String[] isimler = {"Ramazan", "Ehsanullah", "Salih", "Niyaz", "A.Fahim", "M.Keskin", "Yunus", "Orhan", "Sahin", "Rumeysa", "Zubeyde", "Meral", "Gulay", "Rana"};
        Random random = new Random();
        ArrayList<String> rastgeleIsimler = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(14) + 1;
            String rastgeleIsim = isimler[randomIndex];
            rastgeleIsimler.add(rastgeleIsim);
        }

        for (String isim : rastgeleIsimler) {
            System.out.println(isim);
        }
    }
}

