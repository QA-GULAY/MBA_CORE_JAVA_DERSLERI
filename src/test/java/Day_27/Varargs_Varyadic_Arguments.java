package Day_27;

public class Varargs_Varyadic_Arguments {
    public static void main(String[] args) {

        // Variable Arguments  **bir metodun sifir veya daha fazla ayni tur arguments almasini sagliyor**
        // **parametrenin sonunda yazilir
        // VARARGS
      int toplam=toplam("2",4,3);
        System.out.println("toplam:"+toplam);           //  9


    }
    public static int toplam(String name,int... sayilar){
        int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;

        }
        return toplam;
    }
}
