import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class practice_canli {
    public static void main(String[] args) {
        /*String[] dashBoard = {"TUM", "gunun teklifleri", "musteri servisi", "   istek listesi", "hediye kartlari", "amazonda satis yapin"};

        String sonuc = (dashBoard.length == 6) ? "boyut dogru" : "boyut yanlis";

        System.out.println("sonuc:" + sonuc);

        for (String title : dashBoard) {
            if (title.trim().equalsIgnoreCase("istek listesi")) {

            }
            System.out.println("iceriyor");
        }*/

        //TASK 2

     /*   String metin = "\"sapka\"icin 223 sonuctan 1-48 arasi";
        String[] array=metin.split(" ");
        System.out.println(Arrays.toString(array));
*/


        //TASK3
      /*  String sentence="Merhaba,nasilsiniz? Ben iyiyim.";
        String[]kelimeler=sentence.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println(kelimeler.length);
*/

        //task4
     /*   String aramaSonucu="\"sapka\"icin 223 sonuctan 1-48 arasi";
        String[]kelimeler=aramaSonucu.split(" ");
        System.out.println(Arrays.toString(kelimeler));


      if (kelimeler[kelimeler.length-2].equals("1-48")){
          System.out.println("1-48 sondan 2. eleman");
      }else {
          System.out.println("1-48 sondan 2. eleman degil");
      }*/

        //task5

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ogrenci bilgilerini giriniz");
        String ogrenciBilgisi = scanner.nextLine();
        temelOgrenciBilgisi(ogrenciBilgisi);
    }

       public static void temelOgrenciBilgisi(String ogrenciBilgisi) {


        String[] basliklar={"Adi","Soyadi","Ulke","Alan"};
        String[] bilgiler = ogrenciBilgisi.split(",");
        System.out.println(Arrays.toString(bilgiler));
           for (int i = 0; i <basliklar.length ; i++) {
               System.out.println(basliklar[i]+":    "+bilgiler[i]);

           }

    }


}










