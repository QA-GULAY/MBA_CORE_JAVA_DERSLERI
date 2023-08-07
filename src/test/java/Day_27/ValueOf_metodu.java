package Day_27;

public class ValueOf_metodu {
    public static void main(String[] args) {
        String camera = "$2,996,95";
        String memoryCard = "$129,95";
        String battery = "$54,95";

        String totalPrice = "$3,181,85";

        String cmrInt = camera.replace("$", "").replace(",", "");
        String mmryCrdInt = memoryCard.replace("$", "").replace(",", "");
        String bttryInt = battery.replace("$", "").replace(",", "");

        String totalPriceInt = totalPrice.replace("$", "").replace(",", "");

        System.out.println(cmrInt + "," + mmryCrdInt + "," + bttryInt + "," + totalPriceInt);

        Integer cameraInt = Integer.valueOf(cmrInt);
        Integer memoryCardInt = Integer.valueOf(mmryCrdInt);
        Integer batteryInt = Integer.valueOf(bttryInt);

        int toplamInt = Integer.parseInt(totalPriceInt);

        String sonuc = (cameraInt + memoryCardInt + batteryInt == toplamInt) ? "Esittir" : "Esit Degildir";
        System.out.println("sonuc:" + sonuc);
    }
}

