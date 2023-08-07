package Day_18;

import java.util.Scanner;

public class toplu_konu_ornek {
    public static void main(String[] args) {
        //kullanicidan  metin girmesini isteme

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        // girilen  metni goruntuleme
        System.out.println("kelime :" + kelime);

        //kelimenin uzunlugunu ogrenme
        int kelimeUzunlugu = kelime.length();
        System.out.println("kelimeUzunlugu :" + kelimeUzunlugu);

        //kelimedeki herhangi karakteri goruntuleme
        char karakter = kelime.charAt(0);
        System.out.println("karakter :" + karakter);

        //concat iki kelimeyi birlestirme
        String birlesmisKelime=kelime.concat("concatenation");
        System.out.println("birlesmisKelime :"+birlesmisKelime);

        //substring istenilen karakterden gerisini yada belli bi araligi yazdirma
        /*String text="hello";
        System.out.println(text.substring(1));      // e
        System.out.println(text.substring(2,4));             // ll (2.3 gelir 4u getirmez*/

        String substring=kelime.substring(3);
        System.out.println("substring :"+substring);


        // kelimenin tumunu buyuk harf yada kucuk harfe cevirme

        String kelimeBuyukHarf=kelime.toUpperCase();
        System.out.println("kelimeBuyukHarf:"+kelimeBuyukHarf);













    }


}
