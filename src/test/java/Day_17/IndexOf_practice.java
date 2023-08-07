package Day_17;

import java.util.Scanner;

public class IndexOf_practice {
    public static void main(String[] args) {
       /* String mba="MASTER MBA";
        System.out.println(mba.indexOf("M", 2));
        System.out.println(mba.indexOf("A", 5));*/

        //task

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        if(cumle.indexOf(kelime)==-1)

        {
            System.out.println("kelime bulunamadi");
        } else

        {
            System.out.println("kelime" + cumle.indexOf(kelime) + ".cu indexte bulundu ");

        }*/

        //TASK

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen bir arama terimi giriniz:");
        String aramaTerimi = scanner.nextLine();

        if (metin.indexOf(aramaTerimi, 5) == -1) {
            System.out.println("Aranan metin bulunamadi");
        } else {
            System.out.println("Aranan metin" + metin.indexOf(aramaTerimi, 5) + ",inci indexte bulundu");
        }
*/
        //TASK   WHILE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen bir arama terimi giriniz:");
        String aramaTerimi = scanner.nextLine();

        int index = metin.indexOf(aramaTerimi, 5);
        while (index != -1) {
            System.out.println("Arama terimi" + index + "indexte bulundu");
            index = metin.indexOf(aramaTerimi, index + 1);
        }
    }
}










































