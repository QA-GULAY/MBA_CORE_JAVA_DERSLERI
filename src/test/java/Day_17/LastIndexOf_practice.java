package Day_17;

import java.util.Scanner;

public class LastIndexOf_practice {
    public static void main(String[] args) {
        //TASK  LASTINDEXOF()
       /* String text="MASTER MBA";
        System.out.println(text.lastIndexOf("A"));
        System.out.println(text.lastIndexOf("M"));*/


        //TASK
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin=scanner.nextLine();

        System.out.println("Lutfen bir arama terimi giriniz");
       String aramaTerimi=scanner.nextLine();

       int index=metin.lastIndexOf(aramaTerimi);
       while (index!=-1){
           System.out.println("arama terimi"+index+"de bulundu");
           index=metin.lastIndexOf(aramaTerimi,index-1);

       }
















    }
}
