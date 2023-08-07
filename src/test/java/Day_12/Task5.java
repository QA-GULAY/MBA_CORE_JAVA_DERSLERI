package Day_12;

public class Task5 {
    public static void main(String[] args) {
        double vizeNotu=65;
        double finalNotu=71;
        double ortalam=ortalamaHesaplam(vizeNotu,finalNotu);
        System.out.println("ortalam:"+ortalam);
    }
    public static double ortalamaHesaplam(double vizeNotu,double finalNotu){

        double ortalam=vizeNotu*0.4 +finalNotu*0.6;
        return ortalam;
    }
}
