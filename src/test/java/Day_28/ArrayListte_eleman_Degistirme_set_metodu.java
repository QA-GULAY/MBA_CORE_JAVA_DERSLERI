package Day_28;

import java.util.ArrayList;

public class ArrayListte_eleman_Degistirme_set_metodu {      //.set()
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Ford");
        System.out.println("orjinal liste:"+cars);   //[BMW, Ford]

        cars.set(0, "Mercedes");
        System.out.println("degistirilmis liste:"+cars);     //[Mercedes, Ford]



        //TASK
        ArrayList<String>stringList=new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("elderberry");
        stringList.add("blueberry");

        if (stringList.size()>5){
            System.out.println("Liste boyutu 5ten buyuk");
            stringList.set(5, "watermelon");

        }else {
            System.out.println("liste boyutu 5 veya 5ten kucuk");
            stringList.add("orange");

        }
        System.out.println(stringList);
























    }
}
