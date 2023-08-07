package Day_18;

public class Substring_forLoopExercise {
    public static void main(String[] args) {
        String text = "MASTER";

        String sonuc = getEveryOtherCharacter(text);  //  M S E

        System.out.println("sonuc :" + sonuc);
    }

    public static String getEveryOtherCharacter(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.substring(i, i + 1);
        }
        return result;
     }
}
