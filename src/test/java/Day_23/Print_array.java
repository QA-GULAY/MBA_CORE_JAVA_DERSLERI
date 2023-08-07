package Day_23;

public class Print_array {
    public static void main(String[] args) {
        String []carList={"Volvo","BMW","Ford","Mazda"};
        printCarList(carList);
    }

    public static void printCarList(String[]carList){
        for (String car:carList) {
            System.out.println("car:"+car);
        }

    }
}
