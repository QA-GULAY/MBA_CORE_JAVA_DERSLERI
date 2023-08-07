package Day_18;

import java.util.Scanner;

public class cumlenin_ilkVeSon_yarisini_yazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("cumle:" + cumle);

        int cumleUzunlugu = cumle.length() ;
        System.out.println("cumleUzunlugu:"+cumleUzunlugu);

        int ortaIndex = cumle.length() / 2;
        System.out.println("orta index:" + ortaIndex);

        String ilkSubstring=cumle.substring(0,ortaIndex);
        System.out.println("ilkSubstring:"+ilkSubstring);

        int sonIndex=cumleUzunlugu;
        String ikinciSubstring=cumle.substring(ortaIndex,cumleUzunlugu);

        System.out.println("ikinci Substring:"+ikinciSubstring);

    }
}
