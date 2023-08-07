package Day_24;

public class en_dusuk_degeri_yazdirma {
    public static void main(String[] args) {

        int[][] sayilar = {{10, 11, 12}, {133, 14, 15}, {16, 17, 18}};

        int ilkDeger    = sayilar[0][0];
        int ikinciDeger = sayilar[0][1];
        int ucuncuDeger = sayilar[0][2];

        int max=ilkDeger;

        if (ikinciDeger>max){
            max=ikinciDeger;
        }
        if (ucuncuDeger>max){
            max=ucuncuDeger;
        }
        System.out.println("max:"+max);


    }
}
