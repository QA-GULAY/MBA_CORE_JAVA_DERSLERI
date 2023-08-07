package Day_17;

import java.util.Scanner;

public class Lenght_practice {
    public static void main(String[] args) {
      /*  String text="MASTER MBA";
        System.out.println(text.length());*/


        //TASK
/*        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin=scanner.nextLine();

        if (metin.length()>=10){
            System.out.println(metin);
        }else {
            System.out.println("string cok kisa");
        }*/

        //TASK

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir erkek ismi giriniz:");
        String erkekIsmi=scanner.nextLine();
        System.out.println(erkekIsmi.length());
        int isim_1=erkekIsmi.length();


        System.out.println("Lutfen bir kiz ismi giriniz");
        String kizIsmi=scanner.nextLine();
        System.out.println(kizIsmi.length());
        int isim_2=kizIsmi.length();

        int uzunlukFarki=isim_1-isim_2;
        System.out.println(uzunlukFarki);



        if (Math.abs(uzunlukFarki)<=3 ){
            System.out.println("iyi bir eslesme!");
        }else {
            System.out.println("uyumsuz isimler");
        }




        //TASK
      /*  Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin=scanner.nextLine();

        System.out.println(metin.length());
        for (int i = 0; i <metin.length() ; i++) {
            System.out.println("MERHABA");

        }*/









    }
}
