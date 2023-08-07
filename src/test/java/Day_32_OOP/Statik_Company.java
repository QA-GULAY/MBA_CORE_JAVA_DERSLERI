package Day_32_OOP;

public class Statik_Company {
    public static void main(String[] args) {
        Company ahmet = new Company();

        ahmet.id=2345;
        ahmet.salary=2323;
        ahmet.ceo="John";


        Company ayse=new Company();

        ayse.id=3456;
        ayse.salary=8769;
        ayse.ceo="John";

        ahmet.ceo="Marry";

        //Static// belirli bi degiskenin objeye ozgu olmamasini istiyorsaniz static atiyorsunuz
        //tum kisiler icin degisiklik istiyorsak static yapmak lazim variable'i,ornegin ahmet ceo ya Marry atadik aysenin ceoda degisicek


        System.out.println(ahmet.ceo);  //marry
        System.out.println(ayse.ceo);   //marry

        //Static varieblalar class ismi ile cagirilabilir

        Company.ceo="Mehmet";
        System.out.println(ahmet.ceo);

        //Static methods
        //class adi ile dirkt metodu cagirabiliriz
        //Statik alanda, statik olmayan(non_static)alandan birseyler cagirip islem yapmak istersek hata aliriz

        int toplam=Company.toplam(4,5);
        System.out.println("toplam:"+toplam);

    }


}
