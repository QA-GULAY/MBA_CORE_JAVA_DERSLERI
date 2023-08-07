package Day_24;

public class Takim_Bilgileri {
    public static void main(String[] args) {
        String [][] takimlar = {
                {"TAKIMLAR","Galibiyet","Beraberlik","Maglubiyet","Altin Gol","Yenilen Gol","Averaj","Puan"},
                {"Galatasaray", "18", "3", "5","52", "19", "33","57"},
                {"Besiktas", "16", "3", "6","47","27","20","51"},
                {"Fenerbahce", "16", "3", "6","47","27","20","51"},
                {"Trabzonspor", "16", "3", "6","47","27","20","51"}
        };
        for (String[]takim:takimlar) {
            String takimAdi=takim[0];
            if (takimAdi.equalsIgnoreCase("Galatasaray")||takimAdi.equalsIgnoreCase("Fenerbahce")){
                for (String takimBilgileri:takim) {
                    System.out.println("takimBilgileri:"+takimBilgileri);

                }
            }
        }
    }
}
