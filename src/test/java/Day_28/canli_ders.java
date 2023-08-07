package Day_28;

import java.util.*;

public class canli_ders {
    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomList = random.nextInt(100) + 1;
            list.add(randomList);

        }
        System.out.println(list);

        //TASK
        Scanner scanner=new Scanner(System.in);
       ArrayList<String>isimler=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Lutfen bir isim giriniz");
            isimler.add(scanner.nextLine());

        }
        System.out.println(isimler);
*/

        //TASK
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle = scanner1.nextLine();

        System.out.println("girilenCumle:" + girilenCumle);
        String[] kelimeList = girilenCumle.split(" ");
        System.out.println(Arrays.toString(kelimeList));


        ArrayList<String> tersCumle = new ArrayList<>();
        tersCumle.addAll(Arrays.asList(kelimeList));
        Collections.reverse(tersCumle);
        System.out.println(tersCumle);

        //TASK
         /*  Scanner scanner=new Scanner(System.in);

           ArrayList<String>isimler=new ArrayList<>();

           for (int i = 0; i <5 ; i++) {
               System.out.println("Lutfen bir isim giriniz");
               isimler.add(scanner.nextLine());
           }
           System.out.println("isimler:"+isimler);
*/
        //TASK
          /* ArrayList<Integer>sayilar=new ArrayList<>();
           Random random=new Random();
           for (int i = 0; i <10 ; i++) {
               int rastgeleSayi=random.nextInt(100)+1;
               sayilar.add(rastgeleSayi);
           }

           System.out.println(sayilar);*/

        //TASK


    }
}
