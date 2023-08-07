package Day_16;

import java.util.Scanner;

public class calculate_square {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen ilk boolean degerini giriniz:");

        boolean durum_1=scanner.nextBoolean();

        System.out.println("Lutfen ikinci boolean degerini giriniz:");

        boolean durum_2=scanner.nextBoolean();

        if (durum_1 && durum_2){
            System.out.println(durum_1 +","+durum_2);

        } else if (durum_1||durum_2) {
            System.out.println(durum_1 +","+durum_2);

        }else {
            System.out.println(durum_1 +","+durum_2);

        }


    }
}
