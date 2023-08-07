package Day_28;

import java.util.ArrayList;

public class ArrayListeki_Elemana_Ulasma_get_metodu {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(101);
        numbers.add(202);
        numbers.add(303);
        numbers.add(404);
        numbers.add(505);
        System.out.println("numbers:"+numbers);
        System.out.println(numbers.get(0));      //101 ---ilk eleman
        System.out.println(numbers.get(2));      //303 ---3.eleman


        // TASK
        ArrayList<String>stringList=new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("elderberry");

        System.out.println(stringList.get(1));             //2.eleman
        System.out.println( stringList.get(4));            //5.eleman



    }

}
