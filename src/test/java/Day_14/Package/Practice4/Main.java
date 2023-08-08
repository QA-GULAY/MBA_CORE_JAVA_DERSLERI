package Day_14.Package.Practice4;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();


        bankAccount.calculateInteres(50000, 4.5, 365);

        int anaPara=50000;
        double faizOrani=4.5;
        int zaman=365;
        double toplamFaizOrani=(anaPara*faizOrani*zaman)/100;
        if (toplamFaizOrani>1000){
            System.out.println("Kazanilan faiziniz 1000den azdir");
        } else if (toplamFaizOrani>1000 && toplamFaizOrani<=5000) {
            System.out.println("Kazanilan faiziniz 1000 ile 5000 arasindadir");

        }else {
            System.out.println("Kazanilan faiziniz 5000den buyuktur");
        }
    }
}