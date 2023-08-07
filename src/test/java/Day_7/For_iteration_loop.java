package Day_7;

public class For_iteration_loop {

    public static void main(String[] args) {
/*
        for (int i = 0; i <5; i++) {
            System.out.println("Hello World!!");

        }*/

        //TASK
       /* for (int i = 0; i <=100 ; i++) {
            System.out.println("i:"+i);

        }*/

        //TASK

      /*  for (int i = 0; i <=10 ; i++) {
            System.out.println("5 x "+i+"="+i*5);

        }*/

        //TASK


       /* for (int i = 2; i <=50; i+=2) {
            System.out.println(i );

        }*/


        //TASK

        /*int sum=0;

        for (int i = 1; i <=100 ; i+=2) {
            sum += i;
            System.out.println("toplam= "+ sum);

        }*/

        //TASK
        /*int takipciSayisi=2000;
        switch (takipciSayisi){
            case 1000:
                System.out.println("1000 takipci sayiniz oldu");
                break;
            case 2000:
                System.out.println("takipci sayiniz 20002 ulasti");
                break;
            case 3000:
                System.out.println("aileniz buyuyor 3000 oldunuz");
                break;
            default:
                System.out.println("gecersiz takipci sayisi");
        }*/

        //TASK

       /* String calisilanGun="carsamba";
        int calismaSaati;
        int calismaUcreti;
        int toplamUcret;
        switch (calisilanGun){
            case "pazartesi":
             calismaSaati=8;
             calismaUcreti=13;
             toplamUcret=calismaUcreti*calismaSaati;
                System.out.println("bugunki kazanciniz=" +toplamUcret);
                break;
            case "sali":
                calismaSaati=7;
                calismaUcreti=9;
                toplamUcret=calismaUcreti*calismaSaati;
                System.out.println("bugunki kazanciniz=" +toplamUcret);
                break;
            case "carsamba":
                calismaSaati=9;
                calismaUcreti=10;
                toplamUcret=calismaUcreti*calismaSaati;
                System.out.println("bugunki kazanciniz=" +toplamUcret +"$");
                break;
            case "persembe":
                calismaSaati=8;
                calismaUcreti=11;
                toplamUcret=calismaUcreti*calismaSaati;
                System.out.println("bugunki kazanciniz=" +toplamUcret);
                break;
            case "cuma":
                calismaSaati=5;
                calismaUcreti=12;
                toplamUcret=calismaUcreti*calismaSaati;
                System.out.println("bugunki kazanciniz=" +toplamUcret);
                break;
            case "cumartesi":
                calismaSaati=3;
                calismaUcreti=15;
                toplamUcret=calismaUcreti*calismaSaati;
                System.out.println("bugunki kazanciniz=" +toplamUcret);
                break;
            case "pazar":
                calismaSaati=0;
                calismaUcreti=0;
                toplamUcret=calismaUcreti*calismaSaati;
                System.out.println("bugunki kazanciniz=" +toplamUcret);
                break;
            default:
                System.out.println("gecersiz deger");
*/

        //TASK
       /* for (int i = 1; i <=100 ; i++) {
            if ((i%3==0)&&(i%2==1)){
                System.out.println(i);


        }*/

        //TASK
        int bahceyeGidilenGunSayisi=0;
        for (int i = 1; i <=365; i++) {
            if (i % 7 == 1 && i % 8 == 0) {
                System.out.println("bahceye gidilmeli");
                bahceyeGidilenGunSayisi++;


            }

        }
        System.out.println("gidilen gun sayisi="+bahceyeGidilenGunSayisi);



















        }
















































}
