package Day_38_Collections_CanliDers;

import java.util.HashSet;
import java.util.Set;

public class Main_Set {
    public static void main(String[] args) {
        Set<String>mySet=new HashSet<>();
        mySet.add("merhaba");
        mySet.add("dunya");
        mySet.add("java");
        mySet.add("programlama");
        System.out.println(mySet);

        for (String kelime:mySet) {
            System.out.println(kelime);
            mySet.remove("java");
            System.out.println(mySet);

        }


    }
}
