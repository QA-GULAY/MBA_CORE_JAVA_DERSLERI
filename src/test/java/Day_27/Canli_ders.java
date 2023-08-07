package Day_27;

import java.util.Scanner;

public class Canli_ders {
    public static void main(String[] args) {
        //task 1
        String badminton ="€49.99";
        String badmintonNet = "€54.80";
        String badmintonBoll = "€13.89";
        String totalPrice = "€118.68";

        String badmintonArr = badminton.replace("€", "");
        String badmintonNetArr = badmintonNet.replace("€", "");
        String badmintonBollArr = badmintonBoll.replace("€", "");
        String totalPriceArr = totalPrice.replace("€", "");

        System.out.println(badmintonArr+","+badmintonNetArr+","+badmintonBollArr);

        Double badmintonDbl = Double.parseDouble(badmintonArr);
        Double badmintonNetDbl = Double.parseDouble(badmintonNetArr);
        Double badmintonBollDbl = Double.parseDouble(badmintonBollArr);
        Double totalPriceDbl = Double.parseDouble(totalPriceArr);

        String toplamDurum = (badmintonDbl + badmintonNetDbl + badmintonBollDbl == totalPriceDbl) ? "Esit" : "Esit Degil";
        System.out.println(toplamDurum);




        // task 1

        System.out.println(yas());


    }
        //task 1
        public static String yas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz");
        Integer dogumYili = scanner.nextInt();

        System.out.println("Lutfen mevcut yili yaziniz");
        Integer mevcutYil = scanner.nextInt();

        Integer yas = mevcutYil - dogumYili;

        return yas.toString();  //YAS INT ,toString metodu ile Stringe dondurduk




    }

    }
