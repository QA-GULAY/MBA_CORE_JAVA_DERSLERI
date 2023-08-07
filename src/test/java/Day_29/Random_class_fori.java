package Day_29;

import java.util.ArrayList;
import java.util.Random;

public class Random_class_fori {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomList = random.nextInt(100) + 1;      //her seferinde degisik sayilar getirir
            list.add(randomList);

        }
        System.out.println(list);


    }
}
