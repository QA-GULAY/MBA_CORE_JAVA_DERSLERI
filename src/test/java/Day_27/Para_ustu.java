package Day_27;

import java.util.Scanner;

public class Para_ustu {
    public static void main(String[] args) {

       Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen alisveris tutarini giriniz");
        Integer alisverisTutari=scanner.nextInt();

        System.out.println("Lutfen odenen tutari giriniz");
        Integer odenenTutar=scanner.nextInt();

        Integer paraUstu=odenenTutar-alisverisTutari;
        System.out.println("paraUstu:"+paraUstu);

    }
}
