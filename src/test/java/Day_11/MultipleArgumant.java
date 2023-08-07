package Day_11;

public class MultipleArgumant {
    public static void main(String[] args) {
        int x = 6;
        int y = 9;
        printMax(x,y);

    }
    public static void printMax(int x ,int y){
        int max=(x>y)? x :y ;
        System.out.println("max :"+max);


    }
}
