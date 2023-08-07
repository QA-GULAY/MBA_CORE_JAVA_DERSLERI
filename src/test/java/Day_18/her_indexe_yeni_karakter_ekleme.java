package Day_18;

import java.util.Scanner;

public class her_indexe_yeni_karakter_ekleme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        System.out.println("kelime :" + kelime);

        int uzunluk = kelime.length();
        int index = 0;
        while (index < uzunluk) {

            char karakter = kelime.charAt(index);

            String birlesmisKelime = karakter + "nny";
            System.out.println("birlesmisKelime:" + birlesmisKelime);
            index++;
        }
    }
}
