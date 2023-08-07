package Day_29;

import java.util.ArrayList;

public class ForEach_Loop_in_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("elderberry");

        for (String fruit : fruits) {
            System.out.println("fruit:" + fruit);
        }

        ArrayList<String> upperCaseFruits = new ArrayList<>();
        for (String fruit : fruits) {
            upperCaseFruits.add(fruit.toUpperCase());
        }
        System.out.println(upperCaseFruits);


    }


}










