package Day_38_;

import java.util.ArrayList;
import java.util.List;

public class Main_List {
    public static void main(String[] args) {
        List<Integer>myList=new ArrayList<>();
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(8);
        myList.add(10);
        for (int i = 0; i < myList.size() ; i++) {
            System.out.println(myList.get(i));

        }
        int thirdElemant=myList.get(2);
        System.out.println("thirdElemant:"+thirdElemant);

        myList.remove(0);
        for (int i = 0; i < myList.size() ; i++) {
            System.out.println(myList.get(i));

        }
        myList.add(12);
        for (int i = 0; i < myList.size() ; i++) {
            System.out.println(myList.get(i));

        }


    }
}
