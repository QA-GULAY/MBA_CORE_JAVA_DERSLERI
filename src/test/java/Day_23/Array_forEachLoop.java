package Day_23;

import java.util.Scanner;

public class Array_forEachLoop {
    public static void main(String[] args) {

      /*  String []cars={"Volvo","BMW","Ford","Mazda"};

        for (String car:cars) {
            System.out.println("car:"+car);

        }*/
        ///////////////////////////////

        /*int []sayilar={1,2,3,4,5};

        for (int sayi:sayilar) {
            System.out.println("sayi:"+sayi);
        }*/

        /////////////////////////////

       /* String []meyveler={"elma","muz","portakal","uzum","kivi"};

        for (String meyve:meyveler) {
            meyve=meyve.toUpperCase();
            System.out.println("meyve:"+meyve);
            
        }*/

        ///////////////////////////////////////////// sayilarin tek tek yazilmasi icin kod blogunun icinde
         //sout yap,sadece tuolam icin kod blogunun disinda yazdir

      /*  double[] ondalikSayilar={1.2,2.3,3.4,5.6,6.7};

        double toplam=0;
        for (double ondalikSayi:ondalikSayilar) {
            toplam +=ondalikSayi;


        }
        System.out.println("toplam:"+toplam);
*/
        //////////////////////////////////////////

        int []sayilar={1,2,3,4,5,2,3,4,2,4,4};

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi=scanner.nextInt();


        int sayac=0;
        for (int sayi:sayilar) {
            if (girilenSayi==sayi){
                sayac++;
            }


        }

        System.out.println("sayac:"+sayac);


















    }
}
