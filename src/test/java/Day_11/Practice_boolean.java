package Day_11;

public class Practice_boolean {
    public static void main(String[] args) {
        boolean deger=false;
        printStatus(deger);

    }
    public static void printStatus(boolean deger){
        String durum=(deger==true)?"active":"inactive";
        System.out.println("deger :"+durum);

    }

}
