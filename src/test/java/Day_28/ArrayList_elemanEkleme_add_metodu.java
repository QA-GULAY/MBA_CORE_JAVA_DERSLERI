package Day_28;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_elemanEkleme_add_metodu {
    public static void main(String[] args) {

        //ARRAY
        String[] cars = new String[10];
        String[] cars1 = {"mercedes", "BMW", "Ford"};

        //ARRAYLIST
        ArrayList<Integer> sayilar = new ArrayList<>();
        ArrayList<Integer> sayilar_1 = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 89, 15));


        //ArrayListe eleman ekleme
        ArrayList<Integer> sayilar_2 = new ArrayList<>();
        sayilar_2.add(10);
        sayilar_2.add(15);
        sayilar_2.add(100);

        //TASK
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Dave");
        System.out.println("names:" + names);

        //TASK2
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("numbers:"+numbers);



    }
}
