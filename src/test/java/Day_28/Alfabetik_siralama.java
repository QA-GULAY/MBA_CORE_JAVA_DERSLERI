package Day_28;

import java.util.ArrayList;
import java.util.Collections;

public class Alfabetik_siralama {
    public static void main(String[] args) {
        ArrayList<String> stringIsimList = new ArrayList<>();
        stringIsimList.add("Ayse");
        stringIsimList.add("Fatma");
        stringIsimList.add("Tuba");
        stringIsimList.add("Selma");
        stringIsimList.add("Belma");
        stringIsimList.add("Saziye");

        Collections.sort(stringIsimList);
        System.out.println(stringIsimList);

    }
}
