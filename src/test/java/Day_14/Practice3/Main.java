package Day_14.Practice3;

public class Main {
    public static void main(String[] args) {
       Araba araba= new Araba();

        System.out.println("ilk degerler");
        System.out.println("markaIsmi:"+araba.markaIsmi);
        System.out.println("satisFiyati:"+araba.satisFiyati);
        System.out.println("piyasadaMi:"+araba.piyasadaMi);

        araba.markaIsmi="HUNDAI";
        araba.satisFiyati=39000;
        araba.piyasadaMi=false;

        System.out.println("ikinci degerler");
        System.out.println("markaIsmi:"+araba.markaIsmi);
        System.out.println("satisFiyati:"+araba.satisFiyati);
        System.out.println("piyasadaMi:"+araba.piyasadaMi);



    }
}
