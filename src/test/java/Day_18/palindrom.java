package Day_18;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lUTFEN BIR METIN GIRINIZ");
        String metin = scanner.nextLine();

        int i = 0;
        int j = metin.length() - 1;
        boolean palindrom = true;

        while (i < j) {
            if (metin.charAt(i) != metin.charAt(j)){
                palindrom=false;
                break;

            }
            i++;
            j--;
        }
        if (palindrom){
            System.out.println("Girilen metin bir palidrom");
        }else {
            System.out.println("Girilen metin bir palidrom degil!!");
        }


    }
}
