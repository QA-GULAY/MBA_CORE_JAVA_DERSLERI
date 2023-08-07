package Day_28;

import java.util.ArrayList;

public class isEmpty_metodu {
    public static void main(String[] args) {      //isEmpty()

        //TASK
        ArrayList<String> stringIsimList = new ArrayList<>();
        System.out.println(stringIsimList.isEmpty());          // true



        stringIsimList.add("Ayse");
        stringIsimList.add("Fatma");
        stringIsimList.add("Tuba");
        stringIsimList.add("Selma");
        stringIsimList.add("Belma");
        stringIsimList.add("Saziye");

        System.out.println(stringIsimList.isEmpty());           //false

        if (stringIsimList.isEmpty()){
            stringIsimList.add("Fatih");
            System.out.println(stringIsimList);

        }else {
            stringIsimList.set(0, "Jale");
            System.out.println(stringIsimList);

        }



    }
}