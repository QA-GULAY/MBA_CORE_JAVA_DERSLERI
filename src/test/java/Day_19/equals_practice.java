package Day_19;

import java.util.Scanner;

public class equals_practice {
    public static void main(String[] args) {
       /* String text_1 = "Master";
        String text_2 = "Test";

        boolean metinlerEsitMi = text_1.equals(text_2);
        //System.out.println("metinlerEsitMi:"+metinlerEsitMi);         1.yol
        if (metinlerEsitMi) {
            System.out.println(text_1 + "esittir" + text_2);         // 2.yol
        }else {
            System.out.println(text_1 + "esittir degildir" + text_2);
        }
*/

        //TASK
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime_1 = scanner.nextLine();

        //System.out.println("kelime_1 :" + kelime_1);      opcional

        System.out.println("lutfen ikinci kelimeyi giriniz");
        String kelime_2 = scanner.nextLine();

        // System.out.println("kelime_2"+kelime_2);           opcional

        boolean kelimelerEsitMi = kelime_1.equals(kelime_2);
        System.out.println("kelimelerEsitMi:" + kelimelerEsitMi);

        if (kelimelerEsitMi) {
            System.out.println(kelime_1 +"    esittir      "    + kelime_2);
        } else {
            System.out.println(kelime_1 +"     esittir degildir     "    + kelime_2);
        }


    }
}
