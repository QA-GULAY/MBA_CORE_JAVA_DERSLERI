package Day_36practice;

public class Main {
    public static void main(String[] args) {
        Cars cars=new Cars("BMW");
        System.out.println(cars.getCarName());
        cars.setCarName("Toyota");
        System.out.println(cars.getCarName());
        System.out.println(cars);
    }

}
