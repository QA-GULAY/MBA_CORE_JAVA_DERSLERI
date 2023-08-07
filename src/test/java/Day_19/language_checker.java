package Day_19;

import java.util.Scanner;

public class language_checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir proglama dili giriniz");
        String programlama_dili = scanner.nextLine();

        if (programlama_dili.equalsIgnoreCase("java")){
            System.out.println("Girilen dil java.Basarili");
        }else if (programlama_dili.equalsIgnoreCase("python")){
            System.out.println("Girilen dil python.Basarili");
        } else if (programlama_dili.equalsIgnoreCase("c++")) {
            System.out.println("Girilen dil c++.Basarili");
        }else {
            System.out.println("Girilen dil kabul edilmedi.Basarisiz");
        }
    }
}
