package Day_19;

import java.util.Scanner;

public class contains_method {
    public static void main(String[] args) {
       /* String text_1="test";
        String text_2="es";

        boolean iceriyormu=text_1.contains(text_2);
        System.out.println("iceriyormu:"+iceriyormu);
        */

        //  TASK
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        if (cumle.contains(kelime)){
            System.out.println(cumle+"cumle ' si  " +kelime+" kelimesini 'sini iceriyor");
        }else {
            System.out.println("  'cumlesi  "+kelime+" kelimesini 'sini icermiyor");
        }*/

        //TASK   listede hedef kelime arama
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isimleri giriniz");
        String isimler = scanner.nextLine();

        System.out.println("Lutfen hedef ismi  giriniz");
        String hedefIsim = scanner.nextLine();

        if (isimler.contains(hedefIsim)){
            System.out.println(hedefIsim+"bulundu");
        }else {
            System.out.println(hedefIsim+"bulunamadi");
        }*/


        //TASK

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen bir parola giriniz");
        String parola = scanner.nextLine();

        if (metin.contains(parola)){
            int parolaIndex=metin.indexOf(parola);
            System.out.println("parola:"+parola+"  "+parolaIndex+".  "+"  indexte bulundu");
        }else {
            System.out.println("parola bulunamadi");

        }*/

        //TASK
       /* String sifre="master";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("metin:"+metin);
        if (metin.contains(sifre)){
            System.out.println("cumle sifre iceriyor");
        }*/
        //  TASK
        /*String sifre="gizliMBApassword";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("metin:"+metin);

        if (metin.contains(sifre)){
            System.out.println("giris onaylandi");
        }else {
            System.out.println("Sahte password");
        }*/

        // TASK
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String girilenKelime = scanner.nextLine();

        System.out.println("kelime:"+girilenKelime);
        int uzunluk=girilenKelime.length();
        String dogruKelime="OpenAl";
        int dogruUzunluk=dogruKelime.length();

        if (dogruUzunluk==uzunluk){
            if (girilenKelime.equals(dogruKelime)) {
                System.out.println("Tebrikler dogru kelimeyi girdiniz");
            }

        }else {
            System.out.println("uzgunum yanlis kelime veya uzunluk");
        }




















    }























    }





