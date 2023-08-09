package Day_38_Collections_CanliDers;

import java.util.HashMap;
import java.util.Map;

public class Map_Pratik {
    public static void main(String[] args) {
        Map<String,Integer>myMap=new HashMap<>();
        myMap.put("elma",3);
        myMap.put("armut",5);
        myMap.put("kiraz",8);
        myMap.put("muz",2);

        System.out.println(myMap);
        myMap.put("portakal",4);
    }
}
