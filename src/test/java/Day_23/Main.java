package Day_23;

public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15};

        int firstElement = ilkElemaniDondur(arr);
        System.out.println("firstElement:" + firstElement);
    }


    public static int ilkElemaniDondur(int[] arr) {

        int ilkEleman = arr[0];
        return ilkEleman;
    }
}

