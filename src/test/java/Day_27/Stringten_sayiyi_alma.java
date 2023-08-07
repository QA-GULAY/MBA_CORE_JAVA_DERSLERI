package Day_27;

public class Stringten_sayiyi_alma {
    public static void main(String[] args) {
        String shirt = "$20";
        String shorts = "$30";
        String shoes = "$30";

        String toplam = "$80";

        System.out.println(shirt + shorts + shoes);

        String shirtArr = shirt.replace("$", "");
        String shortsArr = shorts.replace("$", "");
        String shoesArr = shoes.replace("$", "");
        String toplamArr = toplam.replace("$", "");

        System.out.println(shirtArr + shortsArr + shoesArr);

        Integer shirtInt = Integer.parseInt(shirtArr);
        Integer shortsInt = Integer.parseInt(shortsArr);
        Integer shoesInt = Integer.parseInt(shoesArr);

        int toplamInt = Integer.parseInt(toplamArr);

        System.out.println(shirtInt + shortsInt + shoesInt);
        String toplamdurum = (shirtInt + shortsInt + shoesInt == toplamInt) ? "Esittir" : "Esit Degildir";
        System.out.println("toplamdurum:" + toplamdurum);

    }
}
