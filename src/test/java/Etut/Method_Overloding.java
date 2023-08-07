package Etut;

public class Method_Overloding {

    //METOD OVERLODING
    //ayni class icinde ayni metodun farkli parametre alarak kullanilmasina denir.

    public static void test(int x) {
        System.out.println("x:"+x);
    }
    public static void test(int x,String name) {
        System.out.println("x:"+x +"name:"+name);
    }

}

