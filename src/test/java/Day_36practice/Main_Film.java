package Day_36practice;

public class Main_Film {
    public static void main(String[] args) {
        Film film=new Film("Advanture QUEST","Cinema Master",2023,"Macera");
        System.out.println(film.getFilmAdi());
        System.out.println(film.getYonetmen());
        film.setVizyonYili(2024);
        film.setTur("Bilim Kurgu");
        System.out.println(film.toString());
    }
}
