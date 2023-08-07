package Day_18;

import java.util.Scanner;

public class sonIndex_yazdirma {   //  lengh()-1

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        // girilen  metni goruntuleme
        System.out.println("kelime :" + kelime);

        //son harf yazdirma
        String sonHarf = kelime.substring(kelime.length() - 1);
        System.out.println("sonHarf:" + sonHarf);

        //sondan 2 harf yazdirma   lengh()-2
        String sonIkiHarf = kelime.substring(kelime.length() - 2);
        System.out.println("sonIkiHarf:" + sonIkiHarf);


    }
}
