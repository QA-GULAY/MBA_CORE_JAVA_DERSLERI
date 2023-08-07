package Day_19;

public class equalsIgnoreCase {
    public static void main(String[] args) {
        String text_1 = "TEST";
        String text_2 = "Test";

        boolean metinlerEsitMi = text_1.equalsIgnoreCase(text_2);
        System.out.println("metinlerEsitMi:"+metinlerEsitMi);
    }
}
