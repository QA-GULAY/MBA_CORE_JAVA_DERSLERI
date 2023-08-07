package Day_23;

import java.util.Scanner;

public class IsimList_olusturma {
    public static void main(String[] args) {

        for (String isim:isimList()) {
            System.out.println("isim:"+isim);
            
        }
        }




    public static String[] isimList(){
    String[]isimler=new String[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen 5 tane isim yaziniz");
        for (int i = 0; i <isimler.length ; i++) {
            isimler [i]  =scanner.nextLine();
        }
        return isimler;
    }




}
