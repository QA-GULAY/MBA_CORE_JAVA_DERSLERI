package Day_38_Collections_CanliDers;

;
import java.util.*;

public class List_pratic {
    public static void main(String[] args) {

        List<Integer>myList=new ArrayList<>();
        myList.add(12);
        myList.add(54);
        myList.add(66);
        myList.add(8);
        myList.add(110);
      //  for (int i = 0; i <myList.size() ; i++) {
       //     System.out.println(myList.get(3));
           System.out.println(myList.remove(3));
            for (int i = 0; i <myList.size() ; i++) {
                System.out.println(myList.get(i));

        }

    }
}
