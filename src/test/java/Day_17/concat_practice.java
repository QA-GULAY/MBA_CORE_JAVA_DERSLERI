package Day_17;

import java.util.Scanner;

public class concat_practice {    //her bir harf yada karaktere ulasmada kullanilir
    public static void main(String[] args) {
        /*String test_1="MASTER";
        String test_2="BRANCH";
        String test_3="ACADEMY";

        System.out.println(test_1.concat(test_2.concat(test_3)));
*/
        //TASK
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir text giriniz:");
        String text_1=scanner.nextLine();

        System.out.println("Lutfen ikinci texti giriniz:");
        String text_2=scanner.nextLine();

        String tamMetin=text_1.concat(text_2);
        System.out.println("tamMetin:"+tamMetin);
*/

        //task
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz:");
        String isim=scanner.nextLine();
        System.out.println("Lutfen bir soyisim giriniz:");
        String soyisim=scanner.nextLine();
        String tamIsim=isim.concat(soyisim);
        System.out.println(isim.concat(" ").concat(soyisim));
        System.out.println(tamIsim.length());



        }


    }


