package Day_19;

import java.util.Scanner;

public class CompareToPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen string giriniz");
        String ilk_string=scanner.nextLine();

        System.out.println("Lutfen string giriniz");
        String ikinci_string=scanner.nextLine();

        int sonuc=ilk_string.compareTo(ikinci_string);
        System.out.println("sonuc:"+sonuc);

        if (sonuc<0){
            System.out.println(ilk_string+"  "+ikinci_string);
        }else if (sonuc>0){
            System.out.println(ikinci_string+"  "+ilk_string);
        }else {
            System.out.println("stringler ayni");
        }








    }
}
