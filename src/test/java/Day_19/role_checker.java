package Day_19;

import java.util.Scanner;

public class role_checker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir rol giriniz");
        String rol=scanner.nextLine();

        if (rol.equalsIgnoreCase("admin")){
            System.out.println("Admin girisi basarli ");
        }else if (rol.equalsIgnoreCase("moderator")){
            System.out.println("Moderator girisi basarili");
        }else if (rol.equalsIgnoreCase("user")){
            System.out.println("User girisi basarili");
        }else {
            System.out.println("Kullanici girisi basarisiz");
        }

    }
}
