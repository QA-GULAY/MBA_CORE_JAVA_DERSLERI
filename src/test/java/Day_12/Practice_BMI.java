package Day_12;

public class Practice_BMI {
    public static void main(String[] args) {
        double kilo = 70;
        double boy = 1.8;
        double BMI = calculateBMI(kilo, boy);
        System.out.println("BMI :"+BMI);
    }

    public static double calculateBMI(double kilo, double boy) {
        double BMI = kilo / boy * 2;
        return BMI;

    }
}
