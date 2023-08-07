package Day_17;

import java.util.Scanner;

public class upper_lower_practice {
    public static void main(String[] args) {

      /*  String text_1="test";
        String text_2="TEST";

      //  System.out.println(text_1.toUpperCase());
        System.out.println(text_2.toLowerCase());
*/
        //TASK
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin=scanner.nextLine();

        if (metin.length()>=5){
            System.out.println(metin.toUpperCase());
        }else {
            System.out.println(metin.toLowerCase());
        }
















    }
}
