package Day_12;

public class Practice {
    public static void main(String[] args) {
        String name="Cagri";
        String surname="Kilic";

        concatenateString(name,surname);
        System.out.println(  concatenateString(name,surname));
    }
    public static String concatenateString(String name,String surname){
        return name + "," + surname;

    }
}
