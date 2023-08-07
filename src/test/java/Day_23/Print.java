package Day_23;

public class Print {
    public static void main(String[] args) {
        int[]sayilar={1,2,3,4,5,6,7,8,9,10};
        MultiplyByTen(sayilar);
    }
    public static void MultiplyByTen(int []sayilar){
        for (int sayi:sayilar) {
            System.out.println("sayi:"+sayi*10);

        }

    }
}
