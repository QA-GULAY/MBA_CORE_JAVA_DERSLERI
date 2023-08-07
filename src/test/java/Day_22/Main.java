package Day_22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* String []meyvelerListesi={"kiraz","karpuz","cilek"};
        for (String meyve:meyvelerListesi) {
            System.out.println(meyve);*/


      /*  int [] sayilar=new int[5];
        sayilar[0]=5;
        sayilar[1]=7;
        sayilar[2]=3;
        sayilar[3]=2;
        sayilar[4]=8;

        for (int sayi:sayilar) {
            sayi +=3;
            System.out.println("yeniSayilar:"+sayi);
*/
/*

       double[] sayilar = {1.0, 2.8, 3.5, 4.0, 5.3, 6.1, 7.2, 8.0, 9.5, 10.1};
        double toplam = sayilar[2] + sayilar[6];
        System.out.println("toplam:" + toplam);
*/
        //TASK//////////
/*

        int[] sayilar = new int[10];
        sayilar[0] = 5;
        sayilar[1] = 7;
        sayilar[2] = 3;
        sayilar[3] = 2;
        sayilar[4] = 8;
        sayilar[5] = 5;
        sayilar[6] = 3;
        sayilar[7] = 12;
        sayilar[8] = 42;
        sayilar[9] = 9;
      */
/*  for (int sayi:sayilar) {
            sayi+=5;
            System.out.println("Sayi"+sayi);
        }*//*


        for (int i = 0; i < sayilar.length ; i++) {
            sayilar[i]=sayilar[i]+5;

        }
        for (int sayi:sayilar) {
            System.out.println("sayi:"+sayi);

        }
*/


        //TASK
/*

        String []isimler={"Ahmet","Fatih","Sener","Soner","Kamil"};
        for (String isim:isimler) {
            System.out.println("isim:"+isim);
*/

        //TASK///////
        int []sayilar={1,2,3,4,5,6,7,8,9,10};
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sayi yaziniz");
       int girilenSayi= scanner.nextInt();

       boolean flag=false;
        for (int sayi:sayilar) {
            if (girilenSayi==sayi){
                flag=true;
                break;
            }
            }
        if (flag){
            System.out.println("geciyor");
        }else {
            System.out.println("gecmiyor");
        }










    }
}
