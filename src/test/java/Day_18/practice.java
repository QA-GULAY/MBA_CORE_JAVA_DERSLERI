package Day_18;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scanner.nextLine();

        System.out.println("kelime:"+kelime);

        int kelimeUzunlugu=kelime.length();
        System.out.println("kelimeUzunlugu:"+kelimeUzunlugu);

        */

       /* Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scanner.nextLine();

        System.out.println("kelime:"+kelime);

        int ortaIndex=kelime.length()/2;
        System.out.println(ortaIndex+ortaIndex);



        int ortadakiKarakter=kelime.length();
        System.out.println(ortadakiKarakter);

        char oKrktr=kelime.charAt(ortaIndex);
        System.out.println(oKrktr);*/

        //TASK

       /* Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scanner.nextLine();

        System.out.println("cumle:"+cumle);


         int ortaCumle=(cumle.length()/2);
        System.out.println(ortaCumle);

        String substring =cumle.substring(5);
        System.out.println(substring);*/

        //      TASK
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        System.out.println("kelime:" + kelime);

        int i=0;
        while (i < kelime.length()) {

            char karakter = kelime.charAt(i);
            String yeniKelime = karakter + "nnny";
            System.out.println(yeniKelime);
            i++;
        }*/


        // TASK

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scanner.nextLine();

        System.out.println("cumle:"+cumle);

        int index=0;
        while (index<cumle.length()-1){
            System.out.println(cumle.length()-1);
            char karakter = cumle.charAt(index);
            System.out.println(karakter);

            index--;
        }











    }

}
