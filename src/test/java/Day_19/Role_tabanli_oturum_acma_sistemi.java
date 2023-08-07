package Day_19;

import java.util.Scanner;

public class Role_tabanli_oturum_acma_sistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir rol giriniz");
        String rol=scanner.nextLine();

        System.out.println("Lutfen bir password giriniz");
        String pasword=scanner.nextLine();

        if (rol.equalsIgnoreCase("yonetici")) {
            if (pasword.equals("AdminPasword")) {
                System.out.println("yonetci girisi basarili");
            } else {
                System.out.println("Lutfen dogru yonetici passwordu giriniz");
            }
        }else if (rol.equalsIgnoreCase("moderator")){
            if (pasword.equals("moderatorPassword")){
                System.out.println("moderator girisi basarili");
            }else {
                System.out.println("Lutfen dogru moderator paswordunu giriniz");
            }
            }else if (rol.equalsIgnoreCase("kullanici")){
                if (pasword.equals("kullaniciPassword")){
                    System.out.println("kullanici girisi basarili");
            }else {
                    System.out.println("Lutfen dogru rol girisini kullaniniz");
                }

        }else {
            System.out.println("Lutfen dogru kullanici girisini kullaniniz");
        }

    }
}
