package Day_18;

import java.util.Scanner;

public class odev1_sonKarakter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        System.out.println("kelime :" + kelime);
        int karakter=kelime.charAt(kelime.length()-1);


        char karaketer='a';
        boolean sonKarakter=(karakter=='a')?true:false;
        System.out.println(sonKarakter);

    }
}
