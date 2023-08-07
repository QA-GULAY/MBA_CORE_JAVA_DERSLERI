package Day_23;

public class ToplamListeUzunlugu {
    public static void main(String[] args) {
        String array[]={"salih","furkan","selman"};
        int toplamUzunluk=toplamListeUzunlugu(array);
        System.out.println("toplamUzunluk:"+toplamUzunluk);


    }
    public static int toplamListeUzunlugu(String[]array){

        int toplam=0;
        for (String herbirEleman:array) {
           toplam=toplam+ herbirEleman.length();
        }

        return toplam;
    }









}
