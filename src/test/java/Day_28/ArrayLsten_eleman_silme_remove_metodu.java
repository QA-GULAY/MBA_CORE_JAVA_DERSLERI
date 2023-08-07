package Day_28;

import java.util.ArrayList;

public class ArrayLsten_eleman_silme_remove_metodu {
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        System.out.println(cars);               //[BMW, Mercedes]

        cars.remove(0);
        System.out.println(cars);               //[Mercedes]


        // TASK 2
        ArrayList<Integer>numberList=new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        System.out.println("numberList:"+numberList);        //[10, 20, 30, 40, 50]


        numberList.remove(3);

        System.out.println(numberList);     //[10,20,30,50]


        //TASK 3
        ArrayList<String>stringList=new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("elderberry");

        System.out.println(stringList);

        System.out.println(stringList.get(2));
        stringList.remove(1);
        System.out.println(stringList);

        stringList.add(2, "fig");
        System.out.println(stringList);


        }
    }

