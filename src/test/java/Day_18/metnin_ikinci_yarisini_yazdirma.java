package Day_18;

import java.util.Scanner;

public class  metnin_ikinci_yarisini_yazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("cumle:" + cumle);

        int cumleYasrsininUzunlugu = cumle.length() / 2;
        System.out.println("cumlenin yarisinin uzunlugu:" + cumleYasrsininUzunlugu);

        String substring = cumle.substring(cumleYasrsininUzunlugu);
        System.out.println("cumlenin ikinci yarisi: " + substring);


    }
}
