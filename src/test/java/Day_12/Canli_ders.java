package Day_12;

public class Canli_ders {
    public static void main(String[] args) {

       String ad= isim();
       String soyIsim= soyIsim();
       String tamIsim=ad+soyIsim;

        System.out.println(tamIsim);

    }
    public static String  isim(){
        String isim="Ahmet";
        return isim;

    }
    public static String  soyIsim(){
        String soyIsim="Vural";
        return soyIsim;

    }




}
