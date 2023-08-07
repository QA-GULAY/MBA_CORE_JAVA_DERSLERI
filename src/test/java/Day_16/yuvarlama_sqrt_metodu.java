package Day_16;

import java.util.Scanner;

public class yuvarlama_sqrt_metodu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scanner.nextDouble();
        System.out.println("sayi:" + sayi);

        double yuvarlama = Math.sqrt(sayi);

        System.out.println("yuvarlama:" + yuvarlama);
        double karakoku = sayi * sayi;
        System.out.println("sayi karakoku=" + karakoku);

    }
}
