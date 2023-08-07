package Day_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class addAll_Metodu {
    public static void main(String[] args) {   //arrayden gelen tum elemanlari arrayliste ekliyor
        /*Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle = scanner1.nextLine();

        System.out.println("girilenCumle:" + girilenCumle);
        String[] kelimeList = girilenCumle.split(" ");
        System.out.println("Array:"+Arrays.toString(kelimeList));


        ArrayList<String> tersCumle = new ArrayList<>();
        tersCumle.addAll(Arrays.asList(kelimeList));
        System.out.println("ArrayList:"+tersCumle);
        Collections.reverse(tersCumle);
        System.out.println("ters cumle:"+tersCumle);*/
        //task kendi yazimim
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCmle=scanner.nextLine();

        String[]arrays=girilenCmle.split(" ");
        System.out.println("parcalanmis liste:"+Arrays.toString(arrays));

        ArrayList<String>myList=new ArrayList<>();
        myList.addAll(Arrays.asList(arrays));
        System.out.println("ArrayList:"+myList);

        Collections.reverse(myList);
        System.out.println("TersLISTE:"+myList);

























    }





}
