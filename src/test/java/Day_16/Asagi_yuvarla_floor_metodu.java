package Day_16;

import java.util.Scanner;

public class Asagi_yuvarla_floor_metodu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir ondalik sayi giriniz");
        double sayi=scanner.nextDouble();
        System.out.println("girilen sayi:"+sayi);
        double asagiYuvarla=Math.floor(sayi);
        System.out.println("asagiYuvarla:"+asagiYuvarla);

        /////////

     /*   Scanner scanner1=new Scanner(System.in);
        System.out.println("Lutfen bir  tamsayi giriniz");
        double sayi1=scanner1.nextDouble();
        System.out.println("girilen sayi:"+sayi1);
        double yuvarla=Math.round(sayi1);
        System.out.println("yuvarla:"+yuvarla);
*/
    }
}
