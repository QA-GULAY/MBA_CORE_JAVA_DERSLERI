import java.util.Scanner;

public class etut_odev {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String girilenMetin=scanner.nextLine();
        System.out.println("girilenMetin:"+girilenMetin);

        System.out.println(ortalamaKarakter(girilenMetin));;
    }
    public static double ortalamaKarakter(String girilenMetin){

        String[]metin=girilenMetin.split(" ");
       double toplamKarakter= 0.0;

        for (String herbirEleman:metin) {
            toplamKarakter=toplamKarakter+ herbirEleman.length();
        }

        return toplamKarakter;


            }


        }


 //   int myInt=(int) myDouble;