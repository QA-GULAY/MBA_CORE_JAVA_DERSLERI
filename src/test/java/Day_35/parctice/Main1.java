package Day_35.parctice;

public class Main1 {
    public static void main(String[] args) {
        calculateArea(5,9);
       calculateArea(10);
    }
    public static double calculateArea(int lenght, int width) {
        double alan = lenght * width;
        return alan;

    }
    public static double calculateArea( int radius) {

        return Math.PI * radius * radius;

    }
}
