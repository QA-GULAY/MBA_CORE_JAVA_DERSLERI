package Day_20;

import java.util.Scanner;

public class startsWith_endsWith {
    public static void main(String[] args) {

        //bu metodlar boolean dondurur

        String name="xaster";

       /* boolean isStartsWith=name.startsWith("m");

        System.out.println("isStartsWith:"+isStartsWith);
        */

        /*boolean isEndWith=name.endsWith("r");
        System.out.println("isEndWith:"+isEndWith);
*/


        //TASK
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin=scanner.nextLine();

        boolean isStarsWith=metin.startsWith("m");
        System.out.println("isStarsWith:"+isStarsWith);

        boolean isEndWith=metin.endsWith("y");
        System.out.println("isEndWith:"+isEndWith);

       /* Lutfen bir metin giriniz
        master branch academy
        isStarsWith:true
        isEndWith:true*/



    }

}
