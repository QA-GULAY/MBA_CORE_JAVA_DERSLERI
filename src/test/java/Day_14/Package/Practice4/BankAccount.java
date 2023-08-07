package Day_14.Package.Practice4;

public class BankAccount {
    public static double calculateInteres(double anaPara,double faizOrani,double zaman){

        double toplamFaizMiktari=(anaPara*faizOrani*zaman)/100;
        return toplamFaizMiktari;
    }
}