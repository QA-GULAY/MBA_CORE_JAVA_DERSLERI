package Day_12;

public class Practice2 {
    public static void main(String[] args) {
        double x = 70.0;
        double a = 10;
        double y = 2.0;
        double b = 2;
                             //72  - // 8  = 64.0
        double result = sum(x, y) - sub(a, b);
        System.out.println("result :" + result);

    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double sub(double a, double b) {
        return a - b;
    }


}


