package Day_12;

public class Task3 {
    public static void main(String[] args) {
        sayi1();
        sayi2();
        int toplamayi=(sayi1()+sayi2());
        System.out.println(toplamayi);
    }
    public static int sayi1(){
        int x =5;
        return x;

    }
    public static int sayi2(){
        int y =9;
        return y;

    }
}
