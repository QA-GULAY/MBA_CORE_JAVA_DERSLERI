package Day_18;

import java.util.Scanner;

public class substringi_ifle_yazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        System.out.println("kelime :" + kelime);

        int kelimeUzunluk=kelime.length();
        System.out.println("kelimeUzunluk:"+kelimeUzunluk);

        if (kelimeUzunluk>5){
            String ilkUcHarf=kelime.substring(0,3);
            System.out.println("ilkUcHarf:"+ilkUcHarf);
        }else {
            String sonIkiHarf=kelime.substring(kelime.length()-2);
            System.out.println("sonIkiHarf:"+sonIkiHarf);
        }
    }
}
