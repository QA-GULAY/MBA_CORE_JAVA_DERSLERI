package Day_29;

import java.util.ArrayList;

public class Kelime_uzunlugu {
    public static void main(String[] args) {
        //TASK

        ArrayList<String> words = new ArrayList<>();
        words.add("elma");
        words.add("muz");
        words.add("kedi");
        words.add("kopek");
        words.add("fil");
        words.add("kurbaga");
        words.add("goril");

        ArrayList<String> longWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= 4) {
                longWords.add(word);

            }
        }
    }
}