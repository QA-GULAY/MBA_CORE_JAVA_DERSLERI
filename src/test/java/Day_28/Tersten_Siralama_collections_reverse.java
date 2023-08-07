package Day_28;

import java.util.ArrayList;
import java.util.Collections;

public class Tersten_Siralama_collections_reverse {
    public static void main(String[] args) {
        ArrayList<String> stringIsimList = new ArrayList<>();
        stringIsimList.add("Ayse");
        stringIsimList.add("Fatma");
        stringIsimList.add("Tuba");
        stringIsimList.add("Selma");
        stringIsimList.add("Belma");
        stringIsimList.add("Saziye");

        Collections.sort(stringIsimList);  //    sort() a dan z ye

        System.out.println(stringIsimList);

        Collections.reverse(stringIsimList); //reverse() z den a ya

        System.out.println(stringIsimList);





    }
}
