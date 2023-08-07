package Day_18;

import java.util.Scanner;

public class tersten_karakter_yazdirma {
    public static void main(String[] args) {

        //   TASK    karakterleri tersten yazdirma  charAt metodu ile
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        System.out.println("kelime :" + kelime);

        for (int i = kelime.length()-1; i >=0 ; i--) {
            char karakter=kelime.charAt(i);
            System.out.print("terten yazimi="+karakter);

        }


    }
}
