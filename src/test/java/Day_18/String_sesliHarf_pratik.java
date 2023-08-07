package Day_18;

import java.util.Scanner;

public class String_sesliHarf_pratik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        String sesliHarf = "";
        int index = 0;
        while (index < metin.length()) {
            char karakter = metin.charAt(index);
            if (isSesliHarf(karakter)) {
                sesliHarf += karakter;
            }
            index++;
        }
        System.out.println("sesliHarf:" + sesliHarf);

    }

    public static boolean isSesliHarf(char karakter) {
        karakter = Character.toLowerCase(karakter);
        return (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'u' || karakter == '0');
    }
}







































































