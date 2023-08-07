package Day_16;

import java.util.Scanner;

public class calculate_disount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urunun fiyatini giriniz:");
        double urunFiyati = scanner.nextDouble();

        System.out.println("Lutfen urun miktarini giriniz:");
        int urunMiktari = scanner.nextInt();

        double toplamFiat = (urunFiyati * urunMiktari);
        System.out.println("Toplam Fiat=" + toplamFiat);

        if (toplamFiat>=500){
            toplamFiat=toplamFiat-(toplamFiat/5);
            System.out.println("toplamFiat:"+toplamFiat);
        } else if (toplamFiat > 100 && toplamFiat < 500) {
            toplamFiat=toplamFiat-(toplamFiat/10);
            System.out.println("toplamFiat:"+toplamFiat);
        }else {
            System.out.println("toplamFiat:"+toplamFiat );
        }


    }
}
