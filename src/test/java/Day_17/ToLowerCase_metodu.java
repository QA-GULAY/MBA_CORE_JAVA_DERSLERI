package Day_17;

import java.util.Scanner;

public class ToLowerCase_metodu {
    public static void main(String[] args) {
        //TASK

        String dogruSifre="Gizli123";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz:");
        String sifre=scanner.nextLine();
        System.out.println("grilen sifre:"+sifre);


        if (dogruSifre.toLowerCase().equals(sifre.toLowerCase())){
            System.out.println("giris basarili");
        }else {
            System.out.println("giris basarisiz");
        }

    }
}
