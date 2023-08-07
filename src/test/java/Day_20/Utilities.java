package Day_20;

public class Utilities {

    /*public String boslukSil(String text) {
        return text.trim();*/



    public void ilkHarfBuyuk(String isim) {
        for (int i = 0; i < isim.length(); i++) {
            String harf = isim.charAt(i) + "";

            if (i == 0) {
                String buyukHarf = harf.toUpperCase();
                System.out.println(" ILK harf BUYUK:" + buyukHarf);
            } else {
                System.out.println("harf:" + harf);
            }

        }


    }
}