package Day_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Canli {
    public static void main(String[] args) {
       /* ArrayList<Integer>sayilar=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        for (Integer sayi:sayilar) {
            System.out.println(sayi);
*/
            //TASK

            Scanner scanner=new Scanner(System.in);

            ArrayList<String>sayilar=new ArrayList<>();

            for (int i = 0; i <5 ; i++) {
                System.out.println("Lutfen bir sayi giriniz");

                sayilar.add(scanner.nextLine());
            }
        for (int i = 0; i <sayilar.size() ; i++) {
            System.out.println(sayilar.get(i)+",");
        }



        }
    }

