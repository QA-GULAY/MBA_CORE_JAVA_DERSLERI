package Day_23;

public class Array_in_methods {
    public static void main(String[] args) {

        int[] sayilar = {1, 2, 3, 4, 5};
        printArray(sayilar);

    }

    public static void printArray(int[] sayilar){

        for (int sayi:sayilar) {
            System.out.println("sayi:"+sayi);

        }
    }

}
