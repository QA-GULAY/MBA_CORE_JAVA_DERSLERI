package Day_27;

import java.util.Scanner;

public class Yas_Kontrolu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        Integer yas = scanner.nextInt();

        Boolean yasDurumu = yas >= 18;

        if (yasDurumu) {
            System.out.println("Ehliyet alabilirsiniz");
        } else {
            System.out.println("Ehliyet almak icin henuz yasiniz uygun degil");
        }
    }
}
