package Day_12;

public class Task4 {
    public static void main(String[] args) {
        boolean okulaDevamDurumu=true;
        boolean derslerdenGecmeDurumu=true;

      boolean diplomaHakki=checkEligibility(okulaDevamDurumu,derslerdenGecmeDurumu);
        if (diplomaHakki){
            System.out.println("tebrikler diploma almaya hak kazandiniz");
        }else {
            System.out.println("sinifta kaldiniz");
        }
    }
    public static boolean checkEligibility(boolean okulaDevamDurumu,boolean derslerdenGecmeDurumu){
        boolean diplomaHakki=(okulaDevamDurumu && derslerdenGecmeDurumu);
        return diplomaHakki;
    }
}
