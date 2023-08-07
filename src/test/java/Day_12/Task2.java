package Day_12;

public class Task2 {
    public static void main(String[] args) {

        double testlerinYuzdesi = 30;

        System.out.println( mesajVer(testlerinYuzdesi));


    }

    public static String mesajVer(double testlerinYuzdesi) {
        String message ="";

        if (testlerinYuzdesi == 0) {
           message="henuz hic otomasyon yaoilmadi";
        } else if (testlerinYuzdesi >   0 && testlerinYuzdesi < 50) {
            message="otomasyonlastirilan testlerin yuzdesi dusuk";

        } else if (testlerinYuzdesi >= 50) {
            message="testlerin buyuk bi kismi otomasyonlastirildi";
        }else {
            message="gecersiz otomasyonyuzdesi";
        }
        return message;

    }
}
