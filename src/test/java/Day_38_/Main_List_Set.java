package Day_38_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main_List_Set {
    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("oreange");
        myList.add("apple");
        myList.add("banana");
        System.out.println("List elemanlari:"+myList);

        Set<String>mySet=new HashSet<>(myList);
        System.out.println("Set elemanlar:"+mySet);



        List<Integer>myIntList=new ArrayList<>();
        myIntList.add(2);
        myIntList.add(4);
        myIntList.add(2);
        myIntList.add(4);
        myIntList.add(6);
        System.out.println("myIntList"+myIntList);


        Set<Integer>myHashList=new HashSet<>(myIntList);
        System.out.println("HashSet List:"+myHashList);



    }
}
