package Day_15.Exercise2;

public class Main {
    public static void main(String[] args) {
    Araba araba = new Araba();
        System.out.println("ilk degerler");
        System.out.println("satisFiati:"+araba.satisFiati);
        System.out.println("markaIsmi:"+araba.markaIsmi);
        System.out.println("piyasadaMi:"+araba.piyasadaMi);

        System.out.println("//////////////////////////////");

        araba.markaIsmi= "Mercedes";
        araba.satisFiati=1700;
        araba.piyasadaMi=true;

        System.out.println("degisen degerler");
        System.out.println("satisFiati:"+araba.satisFiati);
        System.out.println("markaIsmi:"+araba.markaIsmi);
        System.out.println("piyasadaMi:"+araba.piyasadaMi);

    }
}
