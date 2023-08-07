package Day_23;

public class Find_min {
    public static void main(String[] args) {
        int[]array={12,4,2,5,7,812,3};
        int sonuc= findMin(array);
        System.out.println("sonuc:"+sonuc);
    }
    public static int findMin(int[]array){

        int min=0;
        for (int arr:array) {
            if (arr<min){
                min=arr;
            }

        }
        return min;
    }
    }

