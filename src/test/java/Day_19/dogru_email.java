package Day_19;

import java.util.Scanner;

public class dogru_email {
    public static void main(String[] args) {
        String dogruEmail="masterbranchacademy@gmail.com";

        Scanner scanner=new Scanner(System.in);
        String girilenEmail;

        do {
            System.out.println("Lutfen emailinii yaziniz");
            girilenEmail=scanner.nextLine();

            if (girilenEmail.equalsIgnoreCase(dogruEmail)){
                System.out.println("giris basarili");
            }

        }while (!girilenEmail.equalsIgnoreCase(dogruEmail));
    }
}
