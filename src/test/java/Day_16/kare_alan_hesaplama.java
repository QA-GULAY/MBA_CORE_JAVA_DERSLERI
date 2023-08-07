package Day_16;

import java.util.Scanner;

public class kare_alan_hesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen karenin kenar uzunlugunu giriniz");

        double kenarUzunlugu=scanner.nextDouble();
        double kareAlan=kenarUzunlugu*kenarUzunlugu;
        System.out.println("kareAlan:"+kareAlan);

        double kareCevre=kenarUzunlugu*4;
        System.out.println("kareCevre:"+kareCevre);

    }
}
