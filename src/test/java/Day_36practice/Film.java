package Day_36practice;

public class Film {
    private String filmAdi;
    private String yonetmen;
    private int vizyonYili;
    private String tur;

    public Film(String filmAdi, String yonetmen, int vizyonYili, String tur) {
        this.filmAdi = filmAdi;
        this.yonetmen = yonetmen;
        this.vizyonYili = vizyonYili;
        this.tur = tur;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public void setFilmAdi(String filmAsi) {
        this.filmAdi = filmAsi;
    }

    public String getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }

    public int getVizyonYili() {
        return vizyonYili;
    }

    public void setVizyonYili(int vizyonYili) {
        this.vizyonYili = vizyonYili;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmAsi='" + filmAdi + '\'' +
                ", yonetmen='" + yonetmen + '\'' +
                ", vizyonYili=" + vizyonYili +
                ", tur='" + tur + '\'' +
                '}';
    }
}
