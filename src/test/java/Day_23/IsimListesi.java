package Day_23;

public class IsimListesi {
    public static void main(String[] args) {

        for (String isim:clasNameList()) {
            System.out.println("isim:"+isim);

        }
    }
    public static String []clasNameList(){
        String []isimler={"John","Marry","Mike"};
        return isimler;
    }
}
