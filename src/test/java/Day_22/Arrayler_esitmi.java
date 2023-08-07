package Day_22;

public class Arrayler_esitmi {
    public static void main(String[] args) {
        int[]arr_1={1,2,3,4,5,6,7,8,9,10,11};
        int[]arr_2={1,2,3,4,5,6,7,8,9,10};

        boolean flag=true;
        int index=0;

        if(arr_1!=arr_2){
            flag=false;

        }else {
            for (int sayi:arr_1) {
            if (sayi!=arr_2[index]){
                flag=false;
                break;

            }
            }
        }
        if (flag){
            System.out.println("esittir");
        }else {
            System.out.println("eresit degildir");
        }


    }
}
