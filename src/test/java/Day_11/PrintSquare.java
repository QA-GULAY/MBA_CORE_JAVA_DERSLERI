package Day_11;

public class PrintSquare {
    public static void main(String[] args) {
        double number=12.5;
        printSquare(number);
        printVolume(number);

    }
    public static void printSquare(double number){
        System.out.println(number*number);

    }
    public static void printVolume(double number){
        System.out.println(number*number*number);

    }
}
