package Day_18;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        System.out.println("kelime :" + kelime);
        char karakter=kelime.charAt(0);
        switch (karakter){
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                System.out.println("Banana");
                break;
            case 'c':
                System.out.println("Cherry");
                break;
            default:
                System.out.println("Diger");

        }

    }
}
