package Day_28;

import java.util.*;

public class While_Loop_ile_liste_alma {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        ArrayList<String> isimListesi = new ArrayList<>();
        while (true){
            System.out.println("Lutfen isim giriniz: ");
            String isim = scanner.nextLine();
            if(isim.equalsIgnoreCase("yeter")){
                break;
            }
            isimListesi.add(isim);
        }
        System.out.println("isimListesi : " + isimListesi);
        Collections.sort(isimListesi);
        System.out.println("isimListesi : " + isimListesi);*/


        //TASK
      /*  Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayiListesi = new ArrayList<>();

        int toplam=0;
        while (true) {
            System.out.println("Lutfen sayi giriniz: ");
            Integer sayi = scanner.nextInt();

            if (sayi.equals(0)) {
                break;
            }
            toplam+=sayi;
            sayiListesi.add(sayi);
        }
        System.out.println("sayiListesi : " + sayiListesi);

            System.out.println("toplam : " + toplam);*/

      /*      //TASK
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> enIyiArkadaslar = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Lutfen  bir isim giriniz: ");
            String isim = scanner.nextLine();
            enIyiArkadaslar.add(isim);

            }
        System.out.println(enIyiArkadaslar);
        for (String arkadasIsmi:enIyiArkadaslar) {
            //System.out.println(arkadasIsmi);
            String yeniIsim="";
            yeniIsim+=arkadasIsmi.charAt(0);
            System.out.println("yeniIsim:"+yeniIsim);
        }*/
        //
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer> sayiListesi = new ArrayList<>();

        while (true) {
            System.out.println("Lutfen sayi giriniz: ");
            Integer sayi = scanner.nextInt();

            if (sayi==0) {
                break;
            }
            if (sayi%2==0){
            sayiListesi.add(sayi);

            }
        }
        System.out.println("sayiListesi : " + sayiListesi);








        }
    }





























