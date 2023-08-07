package Day_16;

import java.util.Scanner;

public class calculate_grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Luttfen notunuzu giriniz:");
        double not = scanner.nextDouble();
        System.out.println("Not:"+not);
        if (not<=50&&not<60) {
            System.out.println("F");
        } else if (not>60 && not<=70) {
            System.out.println("D");
        } else if (not>70 && not<=80) {
            System.out.println("C");
        } else if (not>80&&not<=90) {
            System.out.println("B");
        } else if (not>90&&not<=100) {
            System.out.println("A");
        }else {
            System.out.println("gecersiz not");
        }


    }
}
