package Day_20.email;

import java.util.Scanner;

public class domein_degistirme {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir email giriniz");
        String email=scanner.nextLine();

        System.out.println("Lutfen yeni bir domain giriniz");
        String yeniDomain=scanner.nextLine();

        String modifiedString=email.replace("@gmail",yeniDomain );
        System.out.println("modifiedString:"+modifiedString);
    }
}
