package Day_38_;

import java.util.HashSet;
import java.util.Set;

public class Main_Set {
    public static void main(String[] args) {

        //Hash set siralamaya bakmiyor kendi istegine gore yazdiriryor
        //Set classi tekrara izin vermiyoer iki kere yazsakta bi elemani tek yazdiriyor

        Set<String> myList = new HashSet<>();
        myList.add("elma");
        myList.add("muz");
        myList.add("kiraz");
        myList.add("elma");
        myList.add("portakal");
        for (String meyve : myList) {
            System.out.println(meyve);

        }
        myList.remove("elma");
        for (String meyve : myList) {
            System.out.println(meyve);

        }
        myList.add("armut");
        myList.remove("elma");
        for (String meyve : myList) {
            System.out.println(meyve);

        }
        myList.clear();
        System.out.println(myList.isEmpty());


    }
}
