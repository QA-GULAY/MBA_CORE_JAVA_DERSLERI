package Day_25;

import java.util.ArrayList;
import java.util.Scanner;

public class String_genel_tekrar {
    public static void main(String[] args) {

        String str="Hello World!";

        //isEmpty
        System.out.println("str.isEmpty() = " + str.isEmpty());  //false

        //indexOf
        System.out.println(str.indexOf("l"));     //2      H-0,e-1,l-2

        //indexOf diger tur
        System.out.println(str.indexOf("l",2));     // 2

        //lastIndexOf
        System.out.println(str.lastIndexOf("l"));          //9

        //lenght
        System.out.println(str.length());     //12

        //toUpperCase
        System.out.println(str.toUpperCase());             // HELLO WORLD!

        //toLowerCase
        System.out.println(str.toLowerCase());            // hello world!

        //concat
        System.out.println(str.concat("Dunya"));       //Hello World!Dunya

        //charAt
        System.out.println(str.charAt(6));              // W

        //EQUALS
        System.out.println(str.equals("Hello World"));     // FALSE

        //equalsIgnoreCase
        System.out.println(str.equalsIgnoreCase("HeLLo WoRld!"));   // TRUE

        //REPLACE
        System.out.println(str.replace("World","Dunya"));    // Hello Dunya!

        //Trim --satirbasi ve sonu bosluklari siler aralari degil--
        System.out.println(str.trim());       //<Hello World!>

        //startsWith
        System.out.println(str.startsWith("H"));     //TRUE   ** bosluk olursa false getiriyor

        //endsWith
        System.out.println(str.endsWith("!"));     //True     ** bosluk olursa false getiriyor

        //subString
        System.out.println(str.substring(4));    // o World!

        //subString
        System.out.println(str.substring(2,str.length()-1 ));   //  llo World

        //contains
        System.out.println(str.contains("or"));  //  true



      // TASK

     /*   Bir kelime girin,
                1. kelime a ile basliyorsa ortada b vars ise ve yine bu kelime a ile bitiyorsa true
        2. kelime a ile basliyorsa  yine bu kelime b ile bitiyorsa false
        3. kelime b ile basliyorsa   false
        4. bu kelime hepsi a ise true
        aaabbba   true
        aaaa   true
        aaab   false
        baa   false
*/

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String girilenMetin=scanner1.nextLine();

        String mesaj=((girilenMetin.startsWith("a")) && (girilenMetin.contains("b")) && (girilenMetin.endsWith("a"))?"true":"false");
        System.out.println("mesaj:"+mesaj);


    }
}
