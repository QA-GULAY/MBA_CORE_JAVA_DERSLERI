package Day_38_;

import java.util.HashMap;
import java.util.Map;

public class Main_Map {
    public static void main(String[] args) {
        Map<String,Integer>myMap=new HashMap<>();
        myMap.put("John",25);
        myMap.put("Sarah",30);
        myMap.put("David",20);
        myMap.put("Emily",35);

        System.out.println(myMap.entrySet());  //tum listeyi yazdiriyor
        System.out.println(myMap.containsKey("John"));  //true/false dondurur icerip icermedigine bakar
        System.out.println(myMap.containsValue(20));
        System.out.println(myMap.get("Sarah"));
        System.out.println(myMap.remove("David"));
        System.out.println(myMap.size());


    }
}
