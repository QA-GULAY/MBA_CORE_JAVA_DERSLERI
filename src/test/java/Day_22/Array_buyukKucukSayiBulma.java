package Day_22;

public class Array_buyukKucukSayiBulma {
    public static void main(String[] args) {

    int[]sayilar={3,1,56,0,23};

    int min=sayilar[0];
    int max=sayilar[0];

        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]<min){
                min=sayilar[i];
            }
            if (sayilar[i]>max){
                max=sayilar[i];
            }
        }
        System.out.println("min:"+min);
        System.out.println("max:"+max);








    }
}
