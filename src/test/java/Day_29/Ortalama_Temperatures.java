package Day_29;

import java.util.ArrayList;

public class Ortalama_Temperatures {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(23.4);
        temperatures.add(27.9);
        temperatures.add(21.6);
        temperatures.add(19.8);
        temperatures.add(25.1);

        int toplam = 0;
        for (Double sicaklik : temperatures) {
            toplam += sicaklik;
        }
        System.out.println("toplam:"+toplam);
        double ortalama=toplam/temperatures.size();
        System.out.println("ortalama:"+ortalama);

        ArrayList<Double> highTemperatures = new ArrayList<>();
        for (Double sicaklik:temperatures) {
            if (sicaklik>=25){
                highTemperatures.add(sicaklik);
            }

        }
        System.out.println("highTemperatures:"+highTemperatures);




    }

}
