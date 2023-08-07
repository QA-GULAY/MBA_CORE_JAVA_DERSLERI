package Day_19;

import java.util.Scanner;

public class equals_ternary_opereytr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime_1 = scanner.nextLine();

        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String kelime_2= scanner.nextLine();

        boolean esitMi=kelime_1.equals(kelime_2);

        String mesaj=(esitMi)?"true":"false";
        System.out.println("mesaj:"+mesaj);


    }
}
