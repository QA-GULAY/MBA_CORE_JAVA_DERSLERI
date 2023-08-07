package Day_35.Etut;

public class Main {
    public static void main(String[] args) {
        test();
        String name="Ahmet";
        test(name);
    }
    public static void test(){
        System.out.println("Parametresi olmayan metod");
    }
    public static void test(String name){
        System.out.println("Parametresi olan metod:"+name);
    }
}
