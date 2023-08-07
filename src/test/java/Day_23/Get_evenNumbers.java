package Day_23;

public class Get_evenNumbers {
    public static void main(String[] args) {

        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int array:  gerEvenNumbers(sayilar)) {
            System.out.println(array);
        }


    }

    public static int[] gerEvenNumbers(int[] sayilar) {


        int sayac = 0;
        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                sayac++;
            }
        }
        int[] ciftSayilar = new int[sayac];
        int index = 0;
        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                ciftSayilar[index]=sayi;
                index++;
            }

        }
        return ciftSayilar;
    }

}


