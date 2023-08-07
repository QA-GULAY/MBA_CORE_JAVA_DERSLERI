package Day_20;

import java.util.Scanner;

public class canli {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String ad=scanner.nextLine();

        System.out.println("Lutfen soyisim giriniz");
        String soyAd=scanner.nextLine();


        System.out.println("Lutfen cinsiyetini belirtiniz");
        String cinsiyeti=scanner.nextLine();

        String degismisSoyad=soyAd.replace("gulderen","sen");
        System.out.println("soyAd:"+soyAd+"   degismisSoyad:"+degismisSoyad);*/

        // ayni soru kisa yol

      /*  Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen adinizi,soyadinizi,yasinizi ve cinsiyetinizi giriniz");
        String kullaniciBilgileri=scanner.nextLine();

        System.out.println("kullaniciBilgileri:"+kullaniciBilgileri);

        String degistirilmisKullaniciBilgileri=kullaniciBilgileri.replaceFirst("Gulderen", "Sen");
        System.out.println("degistirilmisKullaniciBilgileri:"+degistirilmisKullaniciBilgileri);
*/
        //TASK
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen metin giriniz");
        String metin=scanner.nextLine();

        System.out.println("metin:"+metin);

        String kahramanIsmi="bal kiz".toUpperCase();


        String degistirilmisMetin=metin.replace("Keloğlan ",kahramanIsmi);
        System.out.println("degistirilmisMetin:"+degistirilmisMetin);
*/
       //task
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen  bir ogrenci isimi giriniz");
        String ogrenci_1=scanner.nextLine();

        System.out.println("Lutfen 2.ogrenci isimini giriniz");
        String ogrenci_2=scanner.nextLine();

        System.out.println("Lutfen 3.ogrenci isimini giriniz");
        String ogrenci_3=scanner.nextLine();

        String nickName="winny";


        if (ogrenci_1.endsWith("e")){
            System.out.println("ogrenci_1:"+nickName);


        }else {
            System.out.println(ogrenci_1);
        }

        if (ogrenci_2.endsWith("e")){
            System.out.println("ogrenci_2:"+ogrenci_2+nickName);


        }else {
            System.out.println(ogrenci_2);
        }
        if (ogrenci_3.endsWith("e")){
            System.out.println("ogrenci_3:"+ogrenci_3+ nickName);


        }else {
            System.out.println(ogrenci_3);
        }


        //TASK
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen istediginiz miktari giriniz");
        double girilenMiktar=scanner.nextDouble();

        System.out.println("girilenMiktar:"+girilenMiktar);
*/
























    }
}
