package Day_22;

import java.util.Scanner;

public class Array_practice {
    public static void main(String[] args) {

       /* int x;
        double y;
        String z;

        //ARRAY OLUSTURMA

        // 1. YOL
        char [] chch={'A','B','C'};

        // 2. YOL
        char [] xxxx= new char[10];
        String [] isim_listesi=new String[100];

        //ARRAY OGELERINE ERISIM

        String[] liste={"elma","kiraz","muz"};

        System.out.println(liste[0]);
        System.out.println(liste[1]);
        System.out.println(liste[2]);

        int[] numbers={12,143,714,515};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
*/
        //TASK
       /* int[]sayi_listesi={5,10,15,20,25,30,35};

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen 0 ile 4 arasinda bir sayi giriniz");
        int girilen_sayi=scanner.nextInt();

        if (girilen_sayi>=0 && girilen_sayi<=4){
            System.out.println(sayi_listesi[girilen_sayi]);
        }else {
            System.out.println("Gecersiz sayi");
        }*/

        //TASK
       /* String[] meyveler = {"elma", "muz", "kiraz", "hurma", "ebegumeci"};
        String ikinciMeyve = (meyveler[1]);
        char cr = (ikinciMeyve.charAt(2));
        System.out.println("ucuncuKarakter:"+cr);
*/

        //TASK

       /* int[] tamSayilar = {3, 5, 7, 9, 11, 13};
        int sayi_1 = tamSayilar[0];
        int sayi_2 = tamSayilar[2];
        int sayi_3 = tamSayilar[4];
        int toplam = sayi_1 + sayi_2 + sayi_3;
        System.out.println("toplam" + toplam);*/

        // System.out.println(tamSayilar[0]+tamSayilar[2]+tamSayilar[4]);

        // ARRAY DEGER ATAMA

       /* String[] meyve_listesi = {"elma", "muz", "portakal"};

        String[] sebze_listesi = new String[5];

        sebze_listesi[0] = "patlican";
        sebze_listesi[1] = "marul";
        sebze_listesi[2] = "sogan";
        sebze_listesi[3] = "sarimsak";
        sebze_listesi[4] = "maydanoz";

        System.out.println(sebze_listesi[3]);

        // ARRAY DEGER DEGISTIRME

        meyve_listesi[0] = "Ananas";
        // System.out.println(meyve_listesi[0]);

        sebze_listesi[4] = "Domates";
        System.out.println(sebze_listesi[4]);
*/
        // TASK
       /* int[]tamSayilar={1,2,3,4,5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 0/4 arasi bir index numarasi giriniz");
        int girilen_sayi=scanner.nextInt();

        if (girilen_sayi>=0 && girilen_sayi<=4){
            tamSayilar[girilen_sayi]=100;
        }else {
            System.out.println("Girilen deger gecersiz");
        }

        System.out.println(tamSayilar[2]);*/

        //TASK

        String[] isimListesi = {"Ahmet", "Mehmet", "Ayse"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilen_sayi = scanner.nextInt();

        if (girilen_sayi >= 0 && girilen_sayi <= 4){
            isimListesi[girilen_sayi]="Fatih";
        }else {
            System.out.println("Gecersiz sayi");
        }
        System.out.println( "Degistirilen isim:"+ isimListesi[girilen_sayi]);



        //ARRAYLERI YAZDIRMA

       /* double [] puanListesi={23,34.5,50,65.7,100};

        for (double puan:puanListesi) {
            puan +=10;
            System.out.println("puan:"+puan);

        }*/

        //TASK
     /*   String[] isimListesi = {"Ahmet", "Mehmet", "Ali"};
        for (String isim : isimListesi) {
             char ilkKarakter=(isim.charAt(0));
            System.out.println("ilkKarakter:"+ilkKarakter);

        }*/


    }
}
