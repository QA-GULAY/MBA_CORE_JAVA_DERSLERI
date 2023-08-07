package Day_23;

public class String_birlestir {
    public static void main(String[] args) {

        String[] array_1 = {"Merhaba", "Dunya"};
        String[] array_2 = {"Nasilsiniz", "iyimisiniz"};

        for (String eleman:arrayBirlestirme(array_1,array_2)) {
            System.out.print(eleman);

        }

        }


    public static String[] arrayBirlestirme(String[] array_1, String[] array_2) {

        int toplamBoyut = array_1.length + array_2.length;

        String[] birlesmisArray = new String[toplamBoyut];

        int index = 0;
        for (String eleman : array_1) {
            birlesmisArray[index] = eleman;
            index++;

        }
        for (String eleman : array_2) {
            birlesmisArray[index] = eleman;
            index++;

        }
        return birlesmisArray;
    }
}