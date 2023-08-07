package Day_19;

import java.util.Scanner;

public class ayni_ilk_karaktere_sahipligi_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime_1 = scanner.nextLine();
        char karakter_1=kelime_1.charAt(0);


        System.out.println("lutfen ikinci kelimeyi giriniz");
        String kelime_2 = scanner.nextLine();
        char karakter_2=kelime_2.charAt(0);

        if (karakter_1 == karakter_2){
            System.out.println("kelimeler ayni ilk karaktere sahiptir");
        }else {
            System.out.println("kelimeler ayni ilk karaktere sahiptir degildir");
        }


    }
}
