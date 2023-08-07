package Day_18;

import java.util.Scanner;

public class orta_karakteri_bulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        System.out.println("kelime :" + kelime);

        int ortaIndex=kelime.length()/2;
        System.out.println("ortaIndex:"+ortaIndex);

        char ortaKarakter=kelime.charAt(ortaIndex);
        System.out.println("ortaKarakter:"+ortaKarakter);





    }

}
