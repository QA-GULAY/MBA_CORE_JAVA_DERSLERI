package Day_19;

import java.util.Scanner;

public class password_checker {  //while ile girilen sifrenin dogrulunu kontrol etme
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        String password="87dkj48j?il";

        String enteredPassword;

        while (true){
            System.out.println("lutfen password giriniz");
            enteredPassword=scanner.nextLine();

            if (enteredPassword.equals(password)){
                System.out.println("giris basarili");
                break;

            }else {
                System.out.println("Gecersiz password!!");
                */


        //task
        Scanner scanner = new Scanner(System.in);
        String password = "87dkj48j?il";

        String enteredPassword;

        do {
            System.out.println("lutfen dogru password giriniz");
            enteredPassword = scanner.nextLine();
            if (enteredPassword.equals(password)) {
                System.out.println("basarili giris");
            }

        } while (!enteredPassword.equals(password));


    }
}



















