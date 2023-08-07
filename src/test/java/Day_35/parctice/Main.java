package Day_35.parctice;

public class Main {
    public static void main(String[] args) {
        pasaportId(24, "Ahmet", "Kulali");
        pasaportId(25, "Ahmet", "Kulali", "Sahin");
    }

    public static String pasaportId(int age, String name, String lastName) {
        String id=age+name+lastName;

        return id;

    }

    public static String pasaportId(int age, String name, String lastName, String middleName) {
        String id=age+name+lastName+middleName;
        return id;
    }
}
