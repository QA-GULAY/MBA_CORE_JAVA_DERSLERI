package Day_12;

public class task {
    public static void main(String[] args) {
        double vizeNotu=70;
        double finalNotu=80;
        double ortalama=ortalamaHesapla(vizeNotu,finalNotu);
        System.out.println("ortalama ="+ortalama );


    }
    public static double ortalamaHesapla(double vizeNotu,double finalNotu){

       double ortalama=vizeNotu*0.4+finalNotu*0.6;
        return ortalama;

    }
}
