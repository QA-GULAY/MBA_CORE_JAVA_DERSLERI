package Day_22;

public class Array_tekrar_eden_oge {
    public static void main(String[] args) {
        int[]sayilar={1,2,3,4,5,2,4,6,7};

        for (int i = 0; i <sayilar.length ; i++) { // 0 1 2 3 4 5 6 7 8(indexler)
            for (int j = i+1; j <sayilar.length ; j++) {
                if (sayilar[i]==sayilar[j]){      //sayilar[0]==sayilar[1]
                    System.out.println(sayilar[i]);
                    break;
                }

            }

        }
    }
}
