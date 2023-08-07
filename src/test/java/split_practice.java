import java.util.Arrays;

public class split_practice {
    public static void main(String[] args) {

      String metin="Her sey cok guzel olacak"  ;
        sonKelime(metin);
    }
    public static void sonKelime(String metin){
        String []sonKelime=metin.split(" ");
        System.out.println(Arrays.toString(sonKelime));
       if (sonKelime.length==5){
           System.out.println("sonKelime metodunun getirdigi kelimenin uzunlugu 5");
       }else {
           System.out.println("sonKelime metodunun getirdigi kelimenin uzunlugu 5 degildir");
       }

    }
}
