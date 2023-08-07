package Day_28;

import java.util.ArrayList;

public class ArrayList_Uzunlugu_size_metodu {
    public static void main(String[] args) {

        ArrayList<String>cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Toyota");

        System.out.println(cars.size());       //3

        //TASK 1
        ArrayList<Integer>sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(45);
        sayilar.add(6);
        sayilar.add(456);
        sayilar.add(4);
        sayilar.add(7);

        if (sayilar.size()>5){
            System.out.println("Arrayin boyutu 5 ten buyuk");
        } else if (sayilar.size()<5) {
            System.out.println("Arayin boyutu 5ten kucuk");

        }else {
            System.out.println("Arrayain botut 5e esittir");
        }


        //TASK 2
        ArrayList<Integer> tamSayilar = new ArrayList<>();
        tamSayilar.add(2);
        tamSayilar.add(5);
        tamSayilar.add(8);
        tamSayilar.add(9);
        tamSayilar.add(6);
        tamSayilar.add(4);

        if (tamSayilar.size() >= 5) {
            tamSayilar.remove(0);
            System.out.println(tamSayilar);

        } else if (tamSayilar.size() < 5) {
            tamSayilar.add(12);
            System.out.println(tamSayilar);
        }else {
            System.out.println(tamSayilar);
        }


    }
        }